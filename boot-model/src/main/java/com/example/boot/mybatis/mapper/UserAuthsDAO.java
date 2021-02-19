package com.example.boot.mybatis.mapper;

import com.example.boot.mybatis.entity.UserAuths;
import org.springframework.stereotype.Repository;

/**
 * UserAuthsDAO继承基类
 */
@Repository
public interface UserAuthsDAO extends MyBatisBaseDao<UserAuths, Integer> {
}