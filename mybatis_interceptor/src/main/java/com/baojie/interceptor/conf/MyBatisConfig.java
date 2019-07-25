package com.baojie.interceptor.conf;

import com.alibaba.druid.pool.DruidDataSource;
import com.baojie.interceptor.dialect.PageIntercepter;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

/**
 * @author jbj
 * @create 2019-07-04 10:33
 */
@Configuration
@EnableTransactionManagement
@Slf4j
public class MyBatisConfig {

    @Autowired
    private DruidDataSource druidDataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(druidDataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.baojie.common.entity.mybatis");
        //添加XML目录
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));

        Interceptor interceptor = new PageIntercepter();
        //此处可设置额外参数
        Properties properties = new Properties();
        properties.setProperty("dialect", "com.baojie.interceptor.dialect.MySqlDialect");
        interceptor.setProperties(properties);
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{interceptor});
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager() {
        return new DataSourceTransactionManager(druidDataSource);
    }

}
