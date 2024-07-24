package com.example.sx2316079.service;

import com.example.sx2316079.dao.UserRepository;
import com.example.sx2316079.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUserById(int id){
       return userRepository.findById(id);
    }

}
