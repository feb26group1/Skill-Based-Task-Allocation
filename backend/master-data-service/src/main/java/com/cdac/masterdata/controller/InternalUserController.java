package com.cdac.masterdata.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cdac.masterdata.dto.UserAuthDto;
import com.cdac.masterdata.service.UserService;

@RestController
@RequestMapping("/internal/users")
public class InternalUserController {

    private final UserService userService;

    public InternalUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{empId}")
    public ResponseEntity<UserAuthDto> getUserForAuthentication(
            @PathVariable String empId) {

        UserAuthDto user =
                userService.getUserForAuthentication(empId);

        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .build();
        }

        return ResponseEntity.ok(user);
    }
}