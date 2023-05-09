package com.example.springcloud.stock.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class StockController {

    @GetMapping("/stocks/reduce")
    public String reduce() {
        log.info("库存-1");
        return "扣减库存成功!";
    }
}
