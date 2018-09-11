package com.mobao.controller;

import com.mobao.entity.dao.UserTest;
import com.mobao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestTestController {

    @Autowired
    private UserService userService;

    @GetMapping("/rest")
    public List<UserTest> rest(){
        return userService.getAllUsers();
    }
}
