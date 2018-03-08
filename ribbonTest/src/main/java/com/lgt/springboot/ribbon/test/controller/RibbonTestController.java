package com.lgt.springboot.ribbon.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: lgt
 * @date: 2018/3/7  17:21
 */
@RestController
@RequestMapping("/")
public class RibbonTestController {

    @Autowired
    private RestTemplate restTemplate;

//    @RequestMapping("test")
//    public String hello() {
//        return restTemplate.getForEntity("http://")
//    }
}
