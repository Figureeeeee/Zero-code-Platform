package com.yupi.zerocodeplatformuser;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.yupi.zerocodeplatformuser.mapper")
@ComponentScan("com.yupi")
public class ZerocodePlatformUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZerocodePlatformUserApplication.class, args);
    }
}