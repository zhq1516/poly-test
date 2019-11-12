package com.spring.build.poly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.spring.build.poly.dao"})
public class PolyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolyApplication.class, args);
    }

}
