package com.example.boot.mybatis.mapper;

import com.example.boot.mybatis.entity.RoleOperator;
import org.springframework.stereotype.Repository;

/**
 * RoleOperatorDAO继承基类
 */
@Repository
public interface RoleOperatorDAO extends MyBatisBaseDao<RoleOperator, RoleOperator> {
}