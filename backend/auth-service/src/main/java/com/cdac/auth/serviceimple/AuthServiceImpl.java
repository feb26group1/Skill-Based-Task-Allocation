package com.cdac.auth.serviceimple;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.cdac.auth.client.MasterDataClient;
import com.cdac.auth.dto.LoginRequest;
import com.cdac.auth.dto.LoginResponse;
import com.cdac.auth.dto.UserAuthDto;
import com.cdac.auth.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final MasterDataClient masterDataClient;

    public AuthServiceImpl(
            AuthenticationManager authenticationManager,
            MasterDataClient masterDataClient) {

        this.authenticationManager = authenticationManager;
        this.masterDataClient = masterDataClient;
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getEmpId(),
                        loginRequest.getPassword()
                )
        );

        UserAuthDto user =
                masterDataClient.getUserForAuthentication(
                        loginRequest.getEmpId()
                );

        return new LoginResponse(
                user.getEmpId(),
                user.getRole()
        );
    }
}