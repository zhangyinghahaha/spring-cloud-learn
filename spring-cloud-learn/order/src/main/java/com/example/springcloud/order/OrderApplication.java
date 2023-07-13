package com.example.springcloud.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * @author ying.zhang01
 */
@SpringBootApplication
@EnableFeignClients
public class OrderApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(OrderApplication.class, args);

//        while(true) {
//            String userName = applicationContext.getEnvironment().getProperty("test.name");
//            String userAge = applicationContext.getEnvironment().getProperty("test.age");
//            //获取当前部署的环境
//            String currentEnv = applicationContext.getEnvironment().getProperty("current.env");
//            System.err.println("in "+currentEnv+" enviroment; "+"user name :" + userName + "; age: " + userAge);
//            TimeUnit.SECONDS.sleep(1);
//        }
    }
}
