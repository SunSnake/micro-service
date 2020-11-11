package com.microservice.member.config;

import com.alibaba.druid.filter.config.ConfigTools;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * author  zhaoqi
 * date  2020/10/22 11:18
 */

@Configuration
public class DataSourceConfig {

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String userName;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.key}")
    private String publicKey;

    @Bean
    public DataSource dataSource() throws Exception {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setJdbcUrl(url);
        dataSource.setUsername(userName);
        //有需求可以将publicKey和password放在别处读取，如本地文件或其它服务器
        dataSource.setPassword(ConfigTools.decrypt(publicKey, password));
        return dataSource;
    }

}
