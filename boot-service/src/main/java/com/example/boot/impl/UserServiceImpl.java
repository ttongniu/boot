package com.example.boot.impl;

import com.example.boot.UserService;
import com.example.boot.mybatis.entity.User;
import com.example.boot.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author niutongtong
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    public User selectByPrimaryKey(Integer id){
      return userMapper.selectByPrimaryKey(id);
    }
}
