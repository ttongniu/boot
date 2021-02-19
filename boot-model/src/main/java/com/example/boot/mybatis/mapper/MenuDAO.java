package com.example.boot.mybatis.mapper;

import com.example.boot.mybatis.entity.Menu;
import org.springframework.stereotype.Repository;

/**
 * MenuDAO继承基类
 */
@Repository
public interface MenuDAO extends MyBatisBaseDao<Menu, Integer> {
}