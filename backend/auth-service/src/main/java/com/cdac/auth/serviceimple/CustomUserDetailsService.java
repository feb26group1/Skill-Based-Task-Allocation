package com.cdac.auth.serviceimple;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cdac.auth.client.MasterDataClient;
import com.cdac.auth.dto.UserAuthDto;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final MasterDataClient masterDataClient;

    public CustomUserDetailsService(
            MasterDataClient masterDataClient) {

        this.masterDataClient = masterDataClient;
    }

    @Override
    public UserDetails loadUserByUsername(String empId)
            throws UsernameNotFoundException {

        UserAuthDto user =
                masterDataClient.getUserForAuthentication(empId);

        if (user == null) {
            throw new UsernameNotFoundException(
                    "User not found: " + empId);
        }

        return org.springframework.security.core.userdetails.User
                .withUsername(user.getEmpId())
                .password(user.getPassword())
                .roles(user.getRole().getRoleName())
                .build();
    }
}