package com.el.provider8001;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: roman.zhang
 * @Date: 2019/4/28 17:19
 * @Version:V1.0
 * @Description:ShopProvider_8001
 */
@Slf4j
@EnableCaching  //开启缓存
@EnableCircuitBreaker  //开启熔断支持
@EnableDiscoveryClient // 服务发现   服务提供者Eureka中心 项目就具有了服务注册的功能。
// 启动工程后，就可以在注册中心的页面看到SPRING-CLOUD-PRODUCER服务。
@EnableEurekaClient // 本服务启动后，会自动加载到Eureka服务中
@SpringBootApplication/*(exclude = {
        DataSourceAutoConfiguration.class
})*/
//@MapperScan(value ="com.el.provider8001.mapper")
public class ShopProvider_8001 extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ShopProvider_8001.class);
    }

    public static void main(String[] args) {
        log.info("[App] Application startup ");
        SpringApplication.run(ShopProvider_8001.class,args);
        log.info("[App] Application started ");
    }
}
