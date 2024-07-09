package com.example.day0709;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GetMessage implements Message {
  @Override
  public void print() {
    System.out.println("Hello world2");
  }
}
