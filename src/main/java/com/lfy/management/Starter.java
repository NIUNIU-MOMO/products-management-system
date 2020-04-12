package com.lfy.management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.lfy.management.mapper")
@EnableTransactionManagement
public class Starter extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Starter.class,args);
    }
}
