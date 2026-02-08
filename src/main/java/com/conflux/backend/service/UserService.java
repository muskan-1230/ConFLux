package com.conflux.backend.service;

import com.conflux.backend.entity.User;
import com.conflux.backend.exception.EmailAlreadyExistsException;
import com.conflux.backend.repository.UserRepository;
import com.conflux.backend.dto.UserRegisterRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(UserRegisterRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new EmailAlreadyExistsException("Email already exists");
        }

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(request.getPassword()));

        user.setRole(request.getRole());

        userRepository.save(user);
    }
}

