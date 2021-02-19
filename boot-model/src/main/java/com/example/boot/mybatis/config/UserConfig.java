package com.example.boot.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author niutongtong
 */
@Configuration
@MapperScan("com.example.boot.mybatis")
public class UserConfig {
}
