package com.example.springcloud.order.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.UUID;

/**
 * @author ying.zhang01
 * @date 2023/6/28
 */
public class FeignAuthInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        String accessToken = UUID.randomUUID().toString();
        requestTemplate.header("Authorization", accessToken);
    }
}
