/**
 * coderinfo Inc.
 * <p>
 * Copyright (c) 201901-2019 All Rights Reserved.
 */
package com.bbalt.charityshop.business.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author fenggang
 * @version Id: MybatisConfig.java, v 0.1 2019年12月23日
 * 19:38 fenggang Exp $
 */
@Configuration
@MapperScan("com.bbalt.charityshop.business.dal.mapper*")
public class MybatisConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
