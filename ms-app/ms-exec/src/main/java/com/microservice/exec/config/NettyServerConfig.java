package com.microservice.exec.config;

import com.microservice.exec.service.WebSocketService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * author  zhaoqi
 * date  2020/11/10 14:51
 */
@Configuration
public class NettyServerConfig implements ApplicationListener<ContextRefreshedEvent> {

    @Value("${server.port}")
    int port;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (event.getApplicationContext().getParent() == null){
            WebSocketService.getInstance().start(port);
        }
    }
}
