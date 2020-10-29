package com.ljh.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.ljh.daoMz", sqlSessionFactoryRef = "sqlSessionFactorymz")
public class DatasourceMzConfig {
    @Bean(name = "datasourcemz")
    @ConfigurationProperties(prefix = "spring.datasource.datasourcemz")
    @Primary
    public DataSource dataSource1(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sqlSessionFactorymz")
    @Primary
    public SqlSessionFactory sqlSessionFactory1(@Qualifier("datasourcemz") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/com/ljh/mapperMz/*.xml"));
        return bean.getObject();
    }

    @Bean
    @Primary
    public DataSourceTransactionManager dataSourceTransactionManager1(@Qualifier("datasourcemz") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    @Primary
    public SqlSessionTemplate sqlSessionTemplate1(@Qualifier("sqlSessionFactorymz") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
