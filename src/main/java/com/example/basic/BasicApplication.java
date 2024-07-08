package com.example.basic;


import com.example.service.MyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class BasicApplication {

  public static void main(String[] args) {
    MyService myService = new MyService();
    myService.hello();
    SpringApplication.run(BasicApplication.class, args);
  }

  @Value("${kakao.api.key}")
  public String name;
}
