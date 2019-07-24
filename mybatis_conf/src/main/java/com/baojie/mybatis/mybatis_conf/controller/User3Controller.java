package com.baojie.mybatis.mybatis_conf.controller;

import com.baojie.mybatis.common.entity.User3;
import com.baojie.mybatis.mybatis_conf.dao.consumer.User3Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jbj
 * @create 2019-07-01 14:55
 */
@RestController
public class User3Controller {

    @Autowired
    private User3Dao user3Dao;

    @GetMapping("/getUser3")
    public List<User3> selectUser() {
        return user3Dao.selectAll();
    }


}
