package com.auth.authservice.infrastructure.controllers;


import com.auth.authservice.application.service.AuthService;
import com.auth.authservice.domain.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody User userModel) {
        User registeredUser = authService.registerUser(userModel);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@Valid @RequestBody User userModel) {
        User authenticatedUser = authService.loginUser(userModel.getEmail(), userModel.getPassword());
        if (authenticatedUser != null) {
            // Generar y devolver un token JWT (no implementado en este ejemplo)
            return ResponseEntity.ok("ok");
        }
        return ResponseEntity.status(401).body("Invalid credentials");
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<?> getAllUsers() {
        List<User> allUsers = authService.getAllUsers();
        return ResponseEntity.ok(allUsers);
    }
}