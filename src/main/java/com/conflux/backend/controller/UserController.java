package com.conflux.backend.controller;

import com.conflux.backend.dto.ApiResponse;
import com.conflux.backend.service.UserService;
import com.conflux.backend.dto.UserRegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> register(
            @RequestBody UserRegisterRequest request) {

        userService.registerUser(request);
        return ResponseEntity.ok(new ApiResponse("User registered successfully"));
    }
}