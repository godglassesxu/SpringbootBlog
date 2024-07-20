package com.xu.spring_boot_blog.controller;

import com.xu.spring_boot_blog.payload.LoginDto;
import com.xu.spring_boot_blog.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    //login rest api
    @PostMapping(value = {"/login", "/signIn"})
    public ResponseEntity<String> login(@RequestBody  LoginDto loginDto) {
        String response = authService.login(loginDto);
        return ResponseEntity.ok(response);
    }
}
