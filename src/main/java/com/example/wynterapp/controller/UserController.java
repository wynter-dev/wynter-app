package com.example.wynterapp.controller;

import com.example.wynterapp.entity.User;
import com.example.wynterapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{userId}")
    public User get(@PathVariable String userId){
        return userService.findUser(userId);
    }


}
