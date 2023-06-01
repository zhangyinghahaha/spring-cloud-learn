package com.example.springcloud.order.controller;

import com.example.springcloud.order.feign.StockService;
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
    private final StockService stockService;

    @GetMapping("/orders")
    public String create() {
        log.info("start create order...");
        String stockResult = stockService.get("牙刷");
        return "create order success!\n" + stockResult;
    }
}
