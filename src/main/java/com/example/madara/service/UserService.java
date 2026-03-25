package com.example.madara.service;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.madara.entity.UserEntity;
import com.example.madara.repository.UserRepository;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity getUsersById(Long id) {
        return userRepository.findById(id).orElse(null);
    }   

    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }
}
