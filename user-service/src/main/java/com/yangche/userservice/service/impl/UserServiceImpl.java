package com.yangche.userservice.service.impl;

import com.yangche.userservice.model.User;
import com.yangche.userservice.repository.IUserRepo;
import com.yangche.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserRepo userRepo;

    @Override
    public User getUserInfo(String userId) {
        return userRepo.findByUserId(userId);
    }
}
