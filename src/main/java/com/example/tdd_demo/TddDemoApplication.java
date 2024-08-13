package com.example.tdd_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.tdd_demo")
public class TddDemoApplication {
  public static void main(String[] args) {
    SpringApplication.run(TddDemoApplication.class, args);
  }
}
