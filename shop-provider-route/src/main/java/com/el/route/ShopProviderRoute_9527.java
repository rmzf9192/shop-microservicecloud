package com.el.route;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: roman.zhang
 * @Date: 2019/4/30 10:02
 * @Version:V1.0
 * @Description:ShopProviderRoute_9527
 */
@SpringBootApplication
@EnableZuulProxy
public class ShopProviderRoute_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ShopProviderRoute_9527.class,args);
    }
}
