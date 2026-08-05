package com.cdac.auth.service;

import com.cdac.auth.dto.LoginRequest;
import com.cdac.auth.dto.LoginResponse;


public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
}

