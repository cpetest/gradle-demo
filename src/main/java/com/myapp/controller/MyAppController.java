package com.myapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppController {
    @RequestMapping("/")
    public String hello(
            @RequestParam(value = "name", required = false, defaultValue = "world") String name) {
        return "hello " + name;
    }
}