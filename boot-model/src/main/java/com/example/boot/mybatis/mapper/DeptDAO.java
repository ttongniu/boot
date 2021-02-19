package com.example.boot.mybatis.mapper;


import com.example.boot.mybatis.entity.Dept;
import org.springframework.stereotype.Repository;

/**
 * DeptDAO继承基类
 */
@Repository
public interface DeptDAO extends MyBatisBaseDao<Dept, Integer> {
}