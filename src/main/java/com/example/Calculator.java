package com.example;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Calculator {
  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    throw new UnsupportedOperationException("Multiplication is not implemented yet");
  }
}
