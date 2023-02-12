package com.wzj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

//指定要扫描的Mapper类的包的路径
@MapperScan("com.wzj.mapper")
@SpringBootApplication
public class MyDemoMain8080 {

    public static void main(String[] args) {
        SpringApplication.run(MyDemoMain8080.class, args);
    }

}
