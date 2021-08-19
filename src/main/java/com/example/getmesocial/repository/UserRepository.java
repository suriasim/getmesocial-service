package com.example.getmesocial.repository;

import com.example.getmesocial.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser() {
        User user = new User( "asim","canada", 40,"asim.com");
        return user;
    }
}
