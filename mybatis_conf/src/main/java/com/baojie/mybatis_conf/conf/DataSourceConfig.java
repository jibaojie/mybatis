package com.baojie.mybatis_conf.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author jbj
 * @create 2019-07-01 17:40
 */
@Configuration
public class DataSourceConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        try {
            bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/*.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bean.getObject();
    }

    @Bean
    public DataSourceTransactionManager mainTransactionManager(){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public SqlSessionTemplate mainSqlSessionTemplate() throws Exception{
        return new SqlSessionTemplate(sqlSessionFactory());
    }


}
