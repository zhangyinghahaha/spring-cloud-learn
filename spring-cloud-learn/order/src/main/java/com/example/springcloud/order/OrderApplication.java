package com.example.springcloud.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.annotation.PostConstruct;

/**
 * @author ying.zhang01
 */
@SpringBootApplication
@EnableFeignClients
public class OrderApplication {
    @Value("${user.name}")
    private String username;

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    @PostConstruct
    public void init() {
        System.out.printf("[init] user name: %s", username);
    }
}
