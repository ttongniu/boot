package com.example.boot.mybatis.mapper;

import com.example.boot.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserDAO继承基类
 */
@Mapper
public interface UserMapper extends MyBatisBaseDao<User, Integer> {
}