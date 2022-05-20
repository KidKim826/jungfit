package com.jung.fitness.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

// 데이터베이스 연관 환경 설정
@Configuration
@MapperScan(basePackages = "com.jung.fitness.model.dao")
public class DBConfig {}