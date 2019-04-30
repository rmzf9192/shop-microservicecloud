package com.el.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: roman.zhang
 * @Date: 2019/4/29 15:08
 * @Version:V1.0
 * @Description:ShopConsumer_9001
 */
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.el.parent"})
@SpringBootApplication
@ComponentScan({"com.el.parent","com.el.consumer"})
@EnableHystrixDashboard
public class ShopConsumer_9001 {
    public static void main(String[] args) {
        SpringApplication.run(ShopConsumer_9001.class,args);
    }
}
