package com.ruvalcaba.users_login.controller;

import com.ruvalcaba.users_login.entity.User;
import com.ruvalcaba.users_login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){

        return userService.verifyUser(user);
    }
}
