package com.baojie.cache.dao;

import com.baojie.common.entity.User;
import com.baojie.common.mapper.MyMapper;

/**
 * @author jbj
 * @create 2019-07-04 11:21
 */

/**
 * readWrite=false表示只读，返回同一个对象
 * readWrite=true表示读写，经过序列化返回两个个对象，实体必须序列化
 * flushInterval
 */
//@CacheNamespace(flushInterval = 2, readWrite = false, size =  10)
//@CacheNamespaceRef(UserDao.class)
public interface UserDao extends MyMapper<User> {
    User getUser2(Integer id);
}
