package com.ganymede.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
    @RequestMapping("hello")
    public String hello(String name) {
        return name;
    }

}
