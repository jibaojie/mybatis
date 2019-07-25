package com.baojie.interceptor.service;

import com.baojie.common.base.BaseServie;
import com.baojie.common.entity.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @author jbj
 * @create 2019-07-04 11:18
 */
public interface UserService extends BaseServie<User> {


    /**
     * 添加分页查询
     * @param rowBounds
     * @return
     */
    List<User> selectAll2(RowBounds rowBounds);

}
