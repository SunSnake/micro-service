package com.microservice.order.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * author  zhaoqi
 * date  2020/10/25 16:04
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@ComponentScan({"com.microservice.order"})
public class WebXml extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebXml.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebXml.class, args);
    }
}
