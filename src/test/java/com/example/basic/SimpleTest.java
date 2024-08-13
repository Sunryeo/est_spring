package com.example.basic;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTest {

  List<Integer> integerList = new ArrayList<>();

  @BeforeEach
  void setUp() {
    integerList.add(10);
  }

  @AfterEach
  void tearDown() {
    integerList.clear();
  }

  @BeforeAll
  static void initAll() {
    System.out.println("테스트 클래스 시작");
  }

  @AfterAll
  static void tearDownAll() {
    System.out.println("테스트 클래스 종료");
  }

  @Disabled("이 테스트는 아직 준비되지 않았습니다.")
  @Test
  void 미완성_테스트() {
    // 테스트 코드
  }

  @Test
  void 간단한_덧셈_테스트() {
    int result = 1 + 1;
    integerList.add(50);
    integerList.add(50);
    integerList.add(50);
    integerList.add(50);
    integerList.add(50);
    System.out.println(integerList.size()); // 6
    Assertions.assertEquals(2, result, "1+1은 2여야만 합니다.");
  }

  @Test
  @DisplayName("1 더하기  1은 2와 같아야한다.")
  void 더하기_테스트2() {
    assertThat(2).isEqualTo(1 + 1);
  }
}
