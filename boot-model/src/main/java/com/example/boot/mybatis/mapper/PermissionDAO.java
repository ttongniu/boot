package com.example.boot.mybatis.mapper;

import com.example.boot.mybatis.entity.Permission;
import org.springframework.stereotype.Repository;

/**
 * PermissionDAO继承基类
 */
@Repository
public interface PermissionDAO extends MyBatisBaseDao<Permission, Integer> {
}