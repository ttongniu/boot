package com.example.boot.mybatis.mapper;

import com.example.boot.mybatis.entity.LoginLog;
import org.springframework.stereotype.Repository;

/**
 * LoginLogDAO继承基类
 */
@Repository
public interface LoginLogDAO extends MyBatisBaseDao<LoginLog, Integer> {
}