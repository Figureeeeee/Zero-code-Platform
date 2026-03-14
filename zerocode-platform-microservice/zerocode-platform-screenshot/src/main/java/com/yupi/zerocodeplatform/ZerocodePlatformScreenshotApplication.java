package com.yupi.zerocodeplatform;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ZerocodePlatformScreenshotApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZerocodePlatformScreenshotApplication.class, args);
    }
}