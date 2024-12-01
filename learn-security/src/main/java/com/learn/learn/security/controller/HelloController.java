package com.learn.learn.security.controller;

import org.hibernate.Session;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greet")
    public String greet(){

        return "Hii";
     }

}
