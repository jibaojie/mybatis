package com.baojie.mybatis_yml.controller;

import com.baojie.common.entity.User;
import com.baojie.mybatis_yml.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jbj
 * @create 2019-07-01 14:55
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/getUser")
    public List<User> selectUser() {
        return userDao.selectAll();
    }


}
