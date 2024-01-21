package com.sphz.demo02config.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo02Controller {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World-demo02";
    }
}
