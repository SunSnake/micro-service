package com.microservice.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * author  zhaoqi
 * date  2020/10/25 15:02
 */
@Slf4j
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EurekaApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
