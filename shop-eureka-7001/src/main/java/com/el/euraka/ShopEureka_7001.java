package com.el.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: roman.zhang
 * @Date: 2019/4/28 16:30
 * @Version:V1.0
 * @Description:ShopEureka_7001
 */
@EnableEurekaServer //EurekaServer服务器端启动类,接受其它微服务注册进来
@SpringBootApplication
public class ShopEureka_7001 {
    public static void main(String[] args) {
        SpringApplication.run(ShopEureka_7001.class,args);
    }
}
