package com.example.tdd_demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

  @Mock private UserRepository mockUserRepository;

  @InjectMocks private UserService userService;
  UserRepository userRepository = mock(UserRepository.class);

  @Test
  void getUserById_존재하는_사용자_조회_성공() {
    // given
    //        UserRepository mockUserRepository = mock(UserRepository.class);
    UserService userService = new UserService(mockUserRepository);

    // when
    User expectedUser = new User(1L, "testuser");
    when(mockUserRepository.findById(anyLong())).thenReturn(Optional.of(expectedUser));

    User actualUser = userService.getUserById(1L);

    // then
    assertEquals(expectedUser, actualUser);
    verify(mockUserRepository).findById(anyLong());
  }

  @Test
  void getUserById_존재하지_않는_사용자_조회_실패() {
    // Given

    // when
    when(mockUserRepository.findById(anyLong())).thenReturn(Optional.empty());

    // When & Then
    assertThrows(UserNotFoundException.class, () -> userService.getUserById(1L));
    verify(mockUserRepository).findById(1L);
  }
}
