package com.example.basic;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository implements UserRepositoryInterface{
  @Override
  public void save(User user) {
    System.out.println("User saved");
  }

  Map<String, User> users = new HashMap<>();

//  public User getUser(String key) {
//    return users.get(key);
//  }

  public User getUser() {
    users.put("max", new User("max@gmail.com", "Max", 20));
    return users.get("max");
  }
}
