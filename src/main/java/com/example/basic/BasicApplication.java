package com.example.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    SpringApplication.run(BasicApplication.class, args);
  }

  @Value("${kakao.api.key}")
  public String name;
}
