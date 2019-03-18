package com.am.permanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.am.permanage.dao")
public class PermanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(PermanageApplication.class, args);
    }

}
