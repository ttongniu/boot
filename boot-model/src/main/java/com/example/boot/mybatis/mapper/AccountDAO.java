package com.example.boot.mybatis.mapper;


import com.example.boot.mybatis.entity.Account;
import org.springframework.stereotype.Repository;

/**
 * AccountDAO继承基类
 * @author niutongtong
 */
@Repository
public interface AccountDAO extends MyBatisBaseDao<Account, Integer> {
}