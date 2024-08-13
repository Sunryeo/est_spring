package com.example.basic;

import com.example.calculator_application.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest_ {
  private Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @DisplayName("양의 정수 둘의 합")
  @Test
  void testAddTwoPositiveNumbers() {
    int result = calculator.addTwoIntegers(3, 4);
    assertEquals(7, result, "3+4 should equal 7");
  }

  @DisplayName("양의 정수와 음의 정수의 합")
  @Test
  void testTwoNegativeNumbers() {
    int result = calculator.addTwoIntegers(3, -4);
    assertEquals(-1, result, "-1 필요");
  }

  @DisplayName("양의 정수와 음의 정수의 합")
  @Test
  void testAddPositiveAndNegativeNumber() {
    int result = calculator.addTwoIntegers(3, -4);
    assertEquals(-1, result, "3 + (-4) should equal -1");
  }

  @DisplayName("양의 정수와 0의 합")
  @Test
  void testAddZero() {
    int result = calculator.addTwoIntegers(3, 0);
    assertEquals(3, result, "3 + 0 should equal 3");
  }

  @DisplayName("Integer overflow 테스트")
  @Test
  void testAddWithOverflow() {
    assertEquals(
        Integer.MIN_VALUE,
        calculator.addTwoIntegers(Integer.MAX_VALUE, 1),
        "Adding 1 to MAX_VALUE should result in MIN_VALUE due to overflow");
  }

  @DisplayName("두 양의 정수의 뺄셈")
  @Test
  void testSubtractTwoIntegers() {
    int result = calculator.subtractTwoIntegers(1, 3);
    assertEquals(-2, result, "1 - 3 should equal -2");
  }

  @DisplayName("두 양의 정수의 곱셈")
  @Test
  void testMultiplyTwoIntegers() {
    int result = calculator.multiplyTwoIntegers(3, 6);
    assertEquals(18, result, "3 * 6 should equal 18");
  }

  @DisplayName("두 양의 정수의 나눗셈: 결과값은 int")
  @Test
  void testDivideTwoIntegers() {
    int result = calculator.divideTwoIntegers(6, 4);
    assertEquals(1, result, "6 / 2 should equal 1 in integer");
  }
}
