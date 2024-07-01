package com.example.basic;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController2 {
  private final UserService userService;

  @Autowired
  public UserController2(UserService userService) {
    this.userService = userService;
  }

  //  @GetMapping("/user/{key}")
  //  public User getUser(@PathVariable String key) {
  //    return userService.getUser(key);
  //  }

  @GetMapping("/user")
  public String getUser() {
    return "Hello";
  }

  @GetMapping("/user/max")
  public String getUserResult() {
    return userService.getUser();
  }
}
