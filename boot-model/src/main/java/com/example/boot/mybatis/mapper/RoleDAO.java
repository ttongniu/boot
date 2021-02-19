package com.example.boot.mybatis.mapper;

import com.example.boot.mybatis.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * RoleDAO继承基类
 */
@Repository
public interface RoleDAO extends MyBatisBaseDao<Role, Integer> {
}