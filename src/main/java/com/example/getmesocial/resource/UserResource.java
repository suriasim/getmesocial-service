package com.example.getmesocial.resource;

import com.example.getmesocial.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {


    @GetMapping("/user")
    public User getUser() {
        User user = new User( "asim","canada", 40,"asim.com");
        return user;
    }

}
