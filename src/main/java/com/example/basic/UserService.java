package com.example.basic;

import org.springframework.stereotype.Service;

@Service
public class UserService {
  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void createUser(User user) {
    userRepository.save(user);
  }

  //  public User getUser(String key) {
  //    User user = userRepository.getUser(key);
  //    System.out.println("오오오오오징어");
  //    return user;
  //  }

  public String getUser() {
    User user = userRepository.getUser();
    System.out.println("오오오오오징어");
    return user.getName();
  }
}
