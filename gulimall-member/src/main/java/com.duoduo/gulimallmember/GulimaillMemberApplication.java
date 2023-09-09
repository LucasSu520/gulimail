package com.duoduo.gulimallmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.duoduo.*")
public class GulimaillMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimaillMemberApplication.class, args);
    }

}
