package com.example.springcloud.order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @PostMapping("/orders")
    public String create() {
        return "create order success!";
    }
}
