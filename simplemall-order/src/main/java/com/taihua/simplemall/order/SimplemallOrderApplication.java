package com.taihua.simplemall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.taihua.simplemall.order.dao")
@SpringBootApplication
public class SimplemallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimplemallOrderApplication.class, args);
    }

}
