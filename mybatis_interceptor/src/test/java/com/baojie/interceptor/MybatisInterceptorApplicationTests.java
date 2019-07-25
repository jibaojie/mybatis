package com.baojie.interceptor;

import com.baojie.interceptor.dialect.PageRowBounds;
import com.baojie.interceptor.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisInterceptorApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        userService.selectAll();
    }

    @Test
    public void testRowBounds() {
        userService.selectAll2(new RowBounds(1, 2));
    }

    @Test
    public void testPageRowBounds() {
        userService.selectAll2(new PageRowBounds(1, 2));
    }

}
