package com.example.getmesocial.service;

import com.example.getmesocial.model.User;
import com.example.getmesocial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser() {
        return userRepository.getUser();

    }

}
