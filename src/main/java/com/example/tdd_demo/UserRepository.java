package com.example.tdd_demo;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);
}
