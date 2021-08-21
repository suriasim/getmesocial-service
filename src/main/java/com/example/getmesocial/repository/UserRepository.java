package com.example.getmesocial.repository;

import com.example.getmesocial.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList();

    public User getUser() {
        User user = new User( "asim","canada", 40,"asim.com");
        return user;
    }

}
