package com.example.study.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 *
 * @author Duanhe
 * @date 2023/04/05
 */
@RestController
public class TestController {

    @GetMapping(value = "/appone", produces = MediaType.APPLICATION_JSON_VALUE)
    public String appOne() {
        System.out.println("appOne");
        return "appOne";
    }

    @GetMapping(value = "/apptwo", produces = MediaType.APPLICATION_JSON_VALUE)
    public String appTwo() {
        System.out.println("appTwo");
        return "appTwo";
    }
}
