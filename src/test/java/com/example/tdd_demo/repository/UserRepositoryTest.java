package com.example.tdd_demo.repository;

import com.example.tdd_demo.entity.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestPropertySource(locations = "classpath:application.yml")
public class UserRepositoryTest {

  @Autowired private TestEntityManager entityManager;

  @Autowired private UserRepository userRepository;

  @Test
  public void testFindByEmail() {
    User user = new User("test@gmail.com", "password", "max");

    entityManager.persist(user);
    entityManager.flush();

    User found = userRepository.findByEmail("test@gmail.com");

    assertThat(found.getPassword()).isEqualTo(user.getPassword());
    assertThat(found.getEmail()).isEqualTo(user.getEmail());
    assertThat(found.getName()).isEqualTo(user.getName());
  }

  @Test
  public void testSaveUser() {
    User user = new User("save@example.com", "password", "Save User");
    User savedUser = userRepository.save(user);

    assertThat(savedUser).hasFieldOrPropertyWithValue("email", "save@example.com");
    assertThat(savedUser).hasFieldOrPropertyWithValue("name", "Save User");
  }

  @Test
  public void testFindUserById() {
    User user = new User("find@example.com", "password", "Find User");
    entityManager.persist(user);
    entityManager.flush();

    User found = userRepository.findById(user.getId()).orElse(null);
    assertThat(found).isNotNull();
    assertThat(found.getEmail()).isEqualTo(user.getEmail());
    assertThat(found.getName()).isEqualTo(user.getName());
  }
}
