package com.baojie.interceptor.dialect;

import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Properties;

/**
 * @author jbj
 * @create 2019-07-23 14:44
 * @description 数据库方言
 */
public interface Dialect {

    /**
     * 跳过count和分页查询
     * @param msId 执行的mybatis方法全名
     * @param parameterObject 方法参数
     * @param rowBounds 分页参数
     * @return true跳过，默认查询结果；false执行分页查询
     */
    boolean skip(String msId, Object parameterObject, RowBounds rowBounds);

    /**
     * 执行分页前，返回true进行count查询，返回false会继续进行下面的beforeCount
     * @param msId
     * @param parameterObject
     * @param rowBounds
     * @return
     */
    boolean  beforeCount(String msId, Object parameterObject, RowBounds rowBounds);

    /**
     * 生成count查询sql
     * @param boundSql 绑定sql对象
     * @param parameterObject
     * @param rowBounds
     * @param countKey
     * @return
     */
    String getCountSql(BoundSql boundSql, Object parameterObject, RowBounds rowBounds, CacheKey countKey);

    /**
     * 执行完 count 查询后
     *
     * @param count 查询结果总数
     * @param parameterObject 接口参数
     * @param rowBounds 分页参数
     */
    void afterCount(long count, Object parameterObject, RowBounds rowBounds);

    /**
     * 执行分页前，返回 true 会进行分页查询，false 会返回默认查询结果
     *
     * @param msId 执行的 MyBatis 方法全名
     * @param parameterObject 方法参数
     * @param rowBounds 分页参数
     * @return
     */
    boolean beforePage(String msId, Object parameterObject, RowBounds rowBounds);

    /**
     * 生成分页查询 sql
     *
     * @param boundSql 绑定 SQL 对象
     * @param parameterObject 方法参数
     * @param rowBounds 分页参数
     * @param pageKey 分页缓存 key
     * @return
     */
    String getPageSql(BoundSql boundSql, Object parameterObject, RowBounds rowBounds, CacheKey pageKey);

    /**
     * 分页查询后，处理分页结果，拦截器中直接 return 该方法的返回值
     *
     * @param pageList 分页查询结果
     * @param parameterObject 方法参数
     * @param rowBounds 分页参数
     * @return
     */
    Object afterPage(List pageList, Object parameterObject, RowBounds rowBounds);

    /**
     * 设置参数
     *
     * @param properties 插件属性
     */
    void setProperties(Properties properties);
}
