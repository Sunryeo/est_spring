package com.example.service;

import com.example.util.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
  private Helper helper;

  @Autowired
  public void setHelper(Helper helper){
    this.helper = helper;
  }

  public String hello() {
    return "Hello, Spring Boot!";
  }
}
