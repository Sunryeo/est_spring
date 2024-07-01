package com.example.basic;

public class UserView {
  public void printUserDetails(User user) {
    System.out.println("User details");
    System.out.println("User name: " + user.getName());
    System.out.println("User email: " + user.getEmail());
  }
}
