package com.baojie.dymic.service.impl;

import com.baojie.common.entity.User;
import com.baojie.dymic.anno.Master;
import com.baojie.dymic.dao.UserDao;
import com.baojie.dymic.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jbj
 * @create 2019-07-04 11:20
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(int id) {
        User user = new User();
        user.setId(id);
        return userDao.selectOne(user);
    }

    @Override
    @Master
    public List<User> selectUser() {
        PageHelper.startPage(2, 1);
        return userDao.selectAll();
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int update(User user) {
        return userDao.updateByPrimaryKeySelective(user);
    }
}
