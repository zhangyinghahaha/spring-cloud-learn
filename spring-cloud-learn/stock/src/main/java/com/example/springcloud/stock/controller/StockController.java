package com.example.springcloud.stock.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

@RestController
@RequiredArgsConstructor
@Slf4j
public class StockController {
    @GetMapping("/stocks/{name}")
    public String get(@PathVariable String name) {
        log.info("查询商品库存");
        return MessageFormat.format("{0}库存为: 10", name);
    }
}
