package com.example.springcloud.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * OpenFeign全局配置
 * @author ying.zhang01
 */
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public FeignAuthInterceptor feignAuthInterceptor() {
        return new FeignAuthInterceptor();
    }
}
