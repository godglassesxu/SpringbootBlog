package com.xu.spring_boot_blog.service;

import com.xu.spring_boot_blog.payload.LoginDto;
import com.xu.spring_boot_blog.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
