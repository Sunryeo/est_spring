package com.example.basic;

import org.springframework.stereotype.Service;

@Service
public class UserService {
  private UserRepositoryInterface userRepository;


  public UserService(UserRepositoryInterface userRepository) {
    this.userRepository = userRepository;
  }

  public void createUser(User user) {
    userRepository.save(user);
  }
}
