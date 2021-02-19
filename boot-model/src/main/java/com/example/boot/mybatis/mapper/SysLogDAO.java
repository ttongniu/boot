package com.example.boot.mybatis.mapper;

import com.example.boot.mybatis.entity.SysLog;
import org.springframework.stereotype.Repository;

/**
 * SysLogDAO继承基类
 */
@Repository
public interface SysLogDAO extends MyBatisBaseDao<SysLog, Integer> {
}