package com.example.springcloud.order.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    private final RestTemplate restTemplate;

    @GetMapping("/orders")
    public String create() {
        log.info("start order...");
        String url = "http://stock/stocks/reduce";
        restTemplate.getForObject(url, String.class);
        return "create order success!";
    }
}
