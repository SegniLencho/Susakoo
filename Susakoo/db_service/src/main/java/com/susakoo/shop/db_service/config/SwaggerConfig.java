package com.susakoo.shop.db_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

//@EnableSwagger2
//@Configuration
public class SwaggerConfig {

//    @Bean
//    public Docket serviceApi() {
//    return new Docket(DocumentationType.SWAGGER_12)
//            .select().apis(RequestHandlerSelectors.basePackage("com.susakoo.shop.db_service"))
//            .paths(regex("/rest.*"))
//            .build();
//
//    }
}

