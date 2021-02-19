package com.example.boot;

import com.example.boot.mybatis.entity.User;

public interface UserService {

   User selectByPrimaryKey(Integer id);

}
