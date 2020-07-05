package com.taihua.simplemall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.taihua.simplemall.product.dao")
@SpringBootApplication
public class SimplemallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimplemallProductApplication.class, args);
    }

}
