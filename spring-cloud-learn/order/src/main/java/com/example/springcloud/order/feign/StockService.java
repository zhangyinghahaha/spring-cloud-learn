package com.example.springcloud.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("stock")
public interface StockService {

    @GetMapping("/stocks/{name}")
    String get(@PathVariable String name);
}
