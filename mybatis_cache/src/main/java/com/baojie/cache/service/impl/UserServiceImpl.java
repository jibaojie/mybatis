package com.baojie.cache.service.impl;

import com.baojie.cache.service.UserService;
import com.baojie.common.base.BaseServiceImpl;
import com.baojie.common.entity.User;
import com.baojie.cache.dao.UserDao;
import org.springframework.stereotype.Service;

/**
 * @author jbj
 * @create 2019-07-04 11:20
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements UserService {


}
