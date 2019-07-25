package com.baojie.mybatis_conf2;

import com.baojie.common.entity.User;
import com.baojie.mybatis_conf2.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisConf2ApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void testRead() {
        System.out.println(userService.getUser(1).toString());
        System.out.println(userService.selectUser().toString());
    }

    @Test
    public void testUpdate() {
        User user = userService.getUser(1);
        user.setId(2);
        userService.insert(user);
        //加了Master注解，会切换到主数据源
        System.out.println(userService.selectUser().toString());
    }

    @Test
    public void testTransaction() {
    }

}
