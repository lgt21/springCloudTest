package com.lgt.springboot.init.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lgt
 * @date: 2018/3/6  9:35
 */
@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping("/test")
    private String test() {
        return "hello, world";
    }

}
