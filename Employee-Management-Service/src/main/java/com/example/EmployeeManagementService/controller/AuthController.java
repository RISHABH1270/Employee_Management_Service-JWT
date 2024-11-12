package com.example.EmployeeManagementService.controller;

import com.example.EmployeeManagementService.model.User;
import com.example.EmployeeManagementService.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    public AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody User user) {
        authService.signup(user);
        return ResponseEntity.ok("User registered successfully");
    }

//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody User user) {
//        String token = authService.login(user.getUsername(), user.getPassword());
//        return ResponseEntity.ok(token);
//    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        try
        {
            System.out.println("Received login request for user: " + user.getUsername());
            String token = authService.login(user.getUsername(), user.getPassword());
            System.out.println("Generated token: " + token);
            return ResponseEntity.ok(token);
        } catch (Exception e) {
            System.out.println("Error during login: " + e.getMessage());
            return ResponseEntity.status(500).body("Internal Server Error: " + e.getMessage());
        }
    }

}
