/**
 * coderinfo Inc.
 * <p>
 * Copyright (c) 201901-2019 All Rights Reserved.
 */
package com.bbalt.charityshop.business.config;

import com.bbalt.charityshop.business.filter.CrossDomainFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @author fenggang
 * @version Id: ConfigurationBean.java, v 0.1 2019年12月23日
 * 16:56 fenggang Exp $
 */
@Configuration
public class ConfigurationFactoryBean {

    @Autowired
    private SwaggerBeanConfig swaggerConfig;

    @Bean
    public FilterRegistrationBean filterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(crossDomainFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }

    @Bean
    public CrossDomainFilter crossDomainFilter() {
        return new CrossDomainFilter();
    }

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(swaggerConfig.getBasePackage()))
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfo(swaggerConfig.getTitle(),
                swaggerConfig.getDescription(), swaggerConfig.getVersion(),
                swaggerConfig.getTermsOfServiceUrl(), new Contact("","",""),
                swaggerConfig.getLicense(), swaggerConfig.getLicenseUrl(), swaggerConfig.getVendorExtensions());
    }

}
