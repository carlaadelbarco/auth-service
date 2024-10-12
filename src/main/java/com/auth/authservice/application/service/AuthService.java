package com.auth.authservice.application.service;

import com.auth.authservice.domain.models.User;
import com.auth.authservice.infrastructure.entities.UserEntity;
import com.auth.authservice.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User registerUser(User userModel) {
        UserEntity user = new UserEntity();
        user.setEmail(userModel.getEmail());
        user.setPassword(bCryptPasswordEncoder.encode(userModel.getPassword()));
        UserEntity savedUser = userRepository.save(user);

        userModel.setId(savedUser.getId());
        return userModel;
    }

    public User loginUser(String email, String password) {
        UserEntity user = userRepository.findByEmail(email);
        if (user != null && bCryptPasswordEncoder.matches(password, user.getPassword())) {
            User userModel = new User();
            userModel.setId(user.getId());
            userModel.setEmail(user.getEmail());
            userModel.setPassword(user.getPassword());
            return userModel;
        }
        return null;
    }

    public List<User> getAllUsers() {
        List<UserEntity> allUsers = userRepository.findAll();
        List<User> userModels = new ArrayList<>();

        if (!allUsers.isEmpty()) {
            for (UserEntity user : allUsers) {
                User userModel = new User();
                userModel.setId(user.getId());
                userModel.setEmail(user.getEmail());
                userModel.setPassword(user.getPassword());
                userModels.add(userModel);
            }
            return userModels;
        }

        return null;
    }
}