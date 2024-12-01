package com.learn.learn.security.controller;


import com.learn.learn.security.model.Users;
import com.learn.learn.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return userService.register(user);
    }

    @GetMapping("/getuser")
    public List<Users> getUser(){
        return userService.getAllUser();
    }
    @PostMapping("/login")
    public String login(@RequestBody Users user){
        System.out.println(user);
        return userService.verify(user);
    }
}
