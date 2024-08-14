package com.example.tdd_demo.repository;

import com.example.tdd_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByEmail(String email);

  boolean existsByEmail(String email);
}
