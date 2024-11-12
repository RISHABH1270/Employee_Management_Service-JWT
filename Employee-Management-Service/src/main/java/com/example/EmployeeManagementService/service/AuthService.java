package com.example.EmployeeManagementService.service;

import com.example.EmployeeManagementService.model.User;
import com.example.EmployeeManagementService.repository.UserRepository;
import com.example.EmployeeManagementService.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService
{
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

//    public String login(String username, String password) {
//        try
//        {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//        }
//        catch (AuthenticationException e)
//        {
//            throw new RuntimeException("Invalid credentials", e);
//        }
//        final UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//        if (userDetails == null) {
//            throw new RuntimeException("User not found with username: " + username);
//        }
//        return jwtUtil.generateToken(userDetails.getUsername());
//    }

    public String login(String username, String password)
    {
        System.out.println("Attempting login for username: " + username);
        try
        {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        }
        catch
        (BadCredentialsException e)
        {
            System.out.println("Invalid credentials for username: " + username);
            throw new RuntimeException("Invalid credentials");
        }
        final UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        String token = jwtUtil.generateToken(userDetails.getUsername());
        System.out.println("Generated Token: " + token);
        return token;
    }


    public User signup(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userRepository.save(user);
    }
}

