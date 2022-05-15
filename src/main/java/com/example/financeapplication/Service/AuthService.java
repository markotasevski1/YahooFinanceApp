package com.example.financeapplication.Service;

import com.example.financeapplication.Model.Exceptions.InvalidArgumentsException;
import com.example.financeapplication.Model.User;
import com.example.financeapplication.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User login(String username, String password) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new InvalidArgumentsException();
        }
        return userRepository.findByUsernameAndPassword(username,
                password).orElseThrow(() -> new InvalidArgumentsException());

    }
}