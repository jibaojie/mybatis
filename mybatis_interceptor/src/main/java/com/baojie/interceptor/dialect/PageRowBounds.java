package com.baojie.interceptor.dialect;

import lombok.Data;
import org.apache.ibatis.session.RowBounds;

/**
 * @author jbj
 * @create 2019-07-25 9:31
 * @description 添加总数量属性
 */
@Data
public class PageRowBounds extends RowBounds {

    private long total;

    public PageRowBounds() {
        super();
    }

    public PageRowBounds(int offset, int limit) {
        super(offset, limit);
    }

}
