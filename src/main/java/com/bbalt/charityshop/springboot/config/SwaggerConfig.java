package com.bbalt.charityshop.springboot.config;

import com.sun.javadoc.Doclet;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Profiles;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2

public class SwaggerConfig {
    @Bean
    public Docket docket(){
        Profiles profiles = Profiles.of("pro");

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bbalt.charityshop.springboot.controller"))
                .build();
    }

    private ApiInfo apiInfo(){
        Contact contact = new Contact("", "", "");

        return new ApiInfo(
                "bbalt-charityShop API文档",
                "bbalt-charityShop API",
                "1.0",
                "https://github.com/bbalt-charityShop",
                 contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                 new ArrayList()
        );
    }


}
