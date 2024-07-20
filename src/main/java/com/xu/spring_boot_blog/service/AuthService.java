package com.xu.spring_boot_blog.service;

import com.xu.spring_boot_blog.payload.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
