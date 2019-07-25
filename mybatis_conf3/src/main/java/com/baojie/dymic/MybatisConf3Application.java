package com.baojie.dymic;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 70934
 * PageHelperAutoConfiguration在多数据源时发生错误
 */
@SpringBootApplication(exclude = PageHelperAutoConfiguration.class)
@MapperScan("com.baojie.mybatis_conf3.dao")
public class MybatisConf3Application {

    public static void main(String[] args) {
        SpringApplication.run(MybatisConf3Application.class, args);
    }

}
