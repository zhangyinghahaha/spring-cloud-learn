package com.example.springcloud.stock.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @PostMapping("/stocks/reduce")
    public String reduce() {
        return "扣减库存成功!";
    }
}
