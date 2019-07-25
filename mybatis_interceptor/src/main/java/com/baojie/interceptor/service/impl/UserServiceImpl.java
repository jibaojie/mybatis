package com.baojie.interceptor.service.impl;

import com.baojie.common.base.BaseServiceImpl;
import com.baojie.common.entity.User;
import com.baojie.interceptor.dao.UserDao;
import com.baojie.interceptor.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jbj
 * @create 2019-07-04 11:20
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements UserService {


    @Override
    public List<User> selectAll2(RowBounds rowBounds) {
        return mapper.selectAll2(rowBounds);
    }

}
