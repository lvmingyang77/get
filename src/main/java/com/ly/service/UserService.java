package com.ly.service;

import com.ly.pojo.User;

import java.util.List;

public interface UserService {

    // 登录校验
    public List<User> login(User user);
    // 注册校验
    public int register(User u);
}
