package com.example.tdd_demo.controller;

import com.example.tdd_demo.entity.User;
import com.example.tdd_demo.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  @PostMapping("/register")
  public ResponseEntity<User> registerUser(@Valid @RequestBody UserRegistrationDto registrationDto) {
    User newUser =
        userService.registerUser(
            registrationDto.getEmail(), registrationDto.getPassword(), registrationDto.getName());
    return new ResponseEntity<>(newUser, HttpStatus.CREATED);
  }

  @GetMapping("/{email}")
  public ResponseEntity<User> getUser(@PathVariable String email) {
    User user = userService.getUserByEmail(email);
    if (user != null) {
      return ResponseEntity.ok(user);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PutMapping("/{email}")
  public ResponseEntity<User> updateUser(
      @PathVariable String email, @RequestBody UserUpdateDto updateDto) {
    User updatedUser =
        userService.updateUser(email, updateDto.getCurrentPassword(), updateDto.getNewName());
    return ResponseEntity.ok(updatedUser);
  }

  @DeleteMapping("/{email}")
  public ResponseEntity<Void> deleteUser(
      @PathVariable String email, @RequestBody UserDeleteDto deleteDto) {
    userService.deleteUser(email, deleteDto.getPassword());
    return ResponseEntity.noContent().build();
  }
}
