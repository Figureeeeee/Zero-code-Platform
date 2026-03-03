package com.yupi.zerocodeplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yupi.zerocodeplatform.mapper")
public class ZerocodePlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZerocodePlatformApplication.class, args);
    }

}
