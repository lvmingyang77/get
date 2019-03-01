package com.ly.dao;

import com.ly.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);
    // 注册
    int insertSelective(User u);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    // 登录
    List<User> selectByUserNameAndPassword(User user);
}