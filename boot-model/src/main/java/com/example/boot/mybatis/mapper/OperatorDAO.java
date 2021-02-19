package com.example.boot.mybatis.mapper;

import com.example.boot.mybatis.entity.Operator;
import org.springframework.stereotype.Repository;

/**
 * OperatorDAO继承基类
 */
@Repository
public interface OperatorDAO extends MyBatisBaseDao<Operator, Integer> {
}