package com.fsw.springbootpro.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * 配置多数据源
 */
@Configuration
public class DataSourceConfig {
    /*//方案一
    @Primary
    @Bean(name = "masterDataSource")
    @Qualifier("masterDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.master")
    public DataSource masterDataSource(){
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "slaveDataSource")
    @Qualifier("slaveDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.slave")
    public DataSource slaveDataSource(){
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "masterTemplate")
    @Qualifier("masterTemplate")
    public JdbcTemplate masterJdbcTemplate(@Qualifier("masterDataSource")DataSource datasource){
        return new JdbcTemplate(datasource);
    }
    @Bean(name = "slaveTemplate")
    @Qualifier("slaveTemplate")
    public JdbcTemplate slaveJdbcTemplate(@Qualifier("slaveDataSource")DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }*/
}
