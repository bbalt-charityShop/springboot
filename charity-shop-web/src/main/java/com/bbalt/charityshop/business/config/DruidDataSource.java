/**
 * coderinfo Inc.
 * <p>
 * Copyright (c) 201901-2019 All Rights Reserved.
 */
package com.bbalt.charityshop.business.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author fenggang
 * @version Id: DruidDataSource.java, v 0.1 2019年12月23日
 * 19:46 fenggang Exp $
 */
@Configuration
public class DruidDataSource {

    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return new com.alibaba.druid.pool.DruidDataSource();
    }

}
