package com.baojie.interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 70934
 */
@SpringBootApplication
@MapperScan("com.baojie.interceptor.dao")
public class MybatisInterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisInterceptorApplication.class, args);
    }

}
