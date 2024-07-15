package com.example.basic;

import com.example.day0709.Message;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication(scanBasePackages = "com.example.day0715")
public class BasicApplication {
  @Value("${server.port}")
  private int port;

  @Value("${spring.application.name}")
  private String appName;

  @PostConstruct
  public void printConfig() {
    //    TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul")); // 타임존 설정 시 PostConstruct 사용하기도 함.
    System.out.println("포트번호: " + port);
    System.out.println("애플리케이션 이름: " + appName);
  }

  public static void main(String[] args) {
    SpringApplication.run(BasicApplication.class, args);
  }

  @Value("${kakao.api.key}")
  public String name;
}
