package com.example.springcloud.provider.cache.service.impl;

import com.baojie.mybatis.common.base.BaseServiceImpl;
import com.baojie.mybatis.common.entity.User;
import com.example.springcloud.provider.cache.dao.UserDao;
import com.example.springcloud.provider.cache.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author jbj
 * @create 2019-07-04 11:20
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements UserService {


}
