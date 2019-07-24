package com.baojie.mybatis_yml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.baojie.mybatis_yml.dao")
public class ProviderMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderMybatisApplication.class, args);
    }

}
