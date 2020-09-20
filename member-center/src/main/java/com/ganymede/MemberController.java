package com.ganymede;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @RequestMapping(value = "hello")
    public String hello(String name) {
        return name;
    }
}
