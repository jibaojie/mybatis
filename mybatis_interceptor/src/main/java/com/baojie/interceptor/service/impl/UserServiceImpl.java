package com.baojie.interceptor.service.impl;

import com.baojie.interceptor.dao.UserDao;
import com.baojie.interceptor.service.UserService;
import com.baojie.common.base.BaseServiceImpl;
import com.baojie.common.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author jbj
 * @create 2019-07-04 11:20
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements UserService {


}
