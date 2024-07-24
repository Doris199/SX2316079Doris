package com.example.sx2316079.controller;

import com.example.sx2316079.entity.User;
import com.example.sx2316079.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public User findUserById(@RequestParam int id){
        return userService.findUserById(id);
    }
}
