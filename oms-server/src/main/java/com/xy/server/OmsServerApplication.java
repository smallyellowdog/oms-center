package com.xy.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xy.mapper")
public class OmsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OmsServerApplication.class, args);
    }

}
