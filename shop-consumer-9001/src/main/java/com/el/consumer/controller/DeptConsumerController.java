package com.el.consumer.controller;

import com.el.parent.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/4/29 15:24
 * @Version:V1.0
 * @Description:DeptConsumerController
 */
@RestController
public class DeptConsumerController {
    //private static final String REST_URL_PREFIX = "http://localhost:8002";
    private static final String REST_URL_PREFIX = "http://shop-provider-dept";

    @Autowired
    private RestTemplate restTemplate;//Spring boot提供的类：可以访问Restful Api

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
       return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add/",dept,boolean.class);
    }

    @RequestMapping("/comsumer/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
}
