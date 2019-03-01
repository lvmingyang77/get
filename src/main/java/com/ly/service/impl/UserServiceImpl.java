package com.ly.service.impl;

import com.ly.dao.UserMapper;
import com.ly.pojo.User;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    // 登录
    @Override
    public List<User> login(User user) {

        return userMapper.selectByUserNameAndPassword(user);
    }

    // 注册
    @Override
    public int register(User u) {

        return userMapper.insertSelective(u);
    }



}
