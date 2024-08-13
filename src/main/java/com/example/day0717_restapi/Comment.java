package com.example.day0717_restapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
  private Long id;
  private String author;
  private String content;
  private LocalDateTime createdAt;
  private BoardPost boardPost;
}
