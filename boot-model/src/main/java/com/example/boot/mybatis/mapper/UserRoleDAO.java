package com.example.boot.mybatis.mapper;


import com.example.boot.mybatis.entity.UserRole;
import org.springframework.stereotype.Repository;

/**
 * UserRoleDAO继承基类
 */
@Repository
public interface UserRoleDAO extends MyBatisBaseDao<UserRole, UserRole> {
}