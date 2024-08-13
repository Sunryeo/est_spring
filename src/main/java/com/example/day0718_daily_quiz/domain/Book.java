package com.example.day0718_daily_quiz.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
  private Long id;
  private String title;
  private String author;
  private String isbn;
  private int price;
  private int publishedYear;
}
