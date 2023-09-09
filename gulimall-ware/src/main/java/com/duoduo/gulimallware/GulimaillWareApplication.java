package com.duoduo.gulimallware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.duoduo.gulimallware.*")
public class GulimaillWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimaillWareApplication.class, args);
    }

}
