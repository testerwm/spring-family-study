package com.spring.security.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author Haotian
 * @version 1.0.0
 * @date 2020/4/23 17:52
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.spring.security.demo.mapper"})
public class JwtServerApplication {
    public static void main(String[] args) {
        SpringApplication.run( JwtServerApplication.class );
    }
}