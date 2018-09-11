package com.mobao.service.impl;

import com.mobao.entity.dao.UserTest;
import com.mobao.mapper.UserTestMapper;
import com.mobao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserTestMapper userTestMapper;

    @Override
    public List<UserTest> getAllUsers() {
        return userTestMapper.selectAllUsers();
    }
}
