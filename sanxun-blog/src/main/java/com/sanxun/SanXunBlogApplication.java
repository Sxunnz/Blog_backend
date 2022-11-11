package com.sanxun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sanxun.mapper")

/**
 * 启动类
 */

public class SanXunBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SanXunBlogApplication.class,args);
    }
}
