/**
 * coderinfo Inc.
 * <p>
 * Copyright (c) 201901-2019 All Rights Reserved.
 */
package com.bbalt.charityshop.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author fenggang
 * @version Id: CharityShopApplication.java, v 0.1 2019年12月23日
 * 16:07 fenggang Exp $
 */
@SpringBootApplication
@EnableSwagger2
public class CharityShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharityShopApplication.class, args);
    }


}
