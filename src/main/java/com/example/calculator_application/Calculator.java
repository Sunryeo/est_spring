package com.example.calculator_application;

public class Calculator {
  public int add(int a, int b) {
    return a + b; // 임시로 0을 반환
  }

  public int addTwoIntegers(int a, int b) {
    if (willAdditionOverflow(a, b)) {
      if (a > 0) {
        return Integer.MIN_VALUE;
      } else {
        return Integer.MAX_VALUE;
      }
    }
    return a + b;
  }

  public int subtractTwoIntegers(int a, int b) {
    return a - b;
  }

  private boolean willAdditionOverflow(int a, int b) {
    if (b > 0 && a > Integer.MAX_VALUE - b) {
      return true;
    }
    if (b < 0 && a < Integer.MIN_VALUE - b) {
      return true;
    }
    return false;
  }

  public int multiplyTwoIntegers(int a, int b) {
    return a * b;
  }

  public int divideTwoIntegers(int a, int b) {
    return a / b;
  }
}
