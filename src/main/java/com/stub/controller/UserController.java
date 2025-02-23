package com.stub.controller;

import com.stub.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public ResponseEntity<String> get() {
        String message = """
                {"message": "success"}
                """;
        return ResponseEntity.ok(message);
    }

    @PostMapping
    public ResponseEntity<User> post(@RequestBody User inputUser) {
        inputUser.setCurrentDateTime(LocalDateTime.now());
        return ResponseEntity.ok(inputUser);
    }
}
