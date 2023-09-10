package com.duoduo.gulimallmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 远程调用其他服务的流程
 * 1、先将服务都注册到注册中心中
 * 2、引入oepnfeign的依赖包
 * 3、声明一个feign接口，然后使用FeignClient来声明
 *     a)声明后，将被调用方的函数签名copy到接口当中接口。
 *     b）在主服务中加入注解EnableOpenfeign
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.duoduo.gulimallmember.feign")
public class GulimaillMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimaillMemberApplication.class, args);
    }

}
