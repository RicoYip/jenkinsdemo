package com.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yeliqiang
 * @version 1.0
 * @date 2020/11/27 10:43
 */
@Slf4j
@RestController
public class DemoController {

    @Value("${aaa.ip}")
    private String ip;

    @RequestMapping("/up")
    public String up(){
        log.error("upupup");
        return "up:" + ip;
    }
}
