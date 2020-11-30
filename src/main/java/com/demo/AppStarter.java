package com.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yeliqiang
 * @version 1.0
 * @date 2020/11/27 10:28
 */

@SpringBootApplication
@Slf4j
public class AppStarter {

    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class);
    }
}
