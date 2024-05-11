package com.yangche.userservice.controller;

import com.yangche.userservice.model.User;
import com.yangche.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public User getUserInfo(@RequestParam("userId") String userId) {
        return userService.getUserInfo(userId);
    }

}
