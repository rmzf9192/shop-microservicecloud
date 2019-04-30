package com.el.consumer.controller;

import com.el.parent.entities.Dept;
import com.el.parent.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/4/29 17:16
 * @Version:V1.0
 * @Description:DeptConsumerFeignController
 */
@RestController
public class DeptConsumerFeignController {
    //通过该接口访问真正的服务接口。
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/feign/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return this.deptClientService.get(id);
    }

    @RequestMapping(value = "/feign/consumer/dept/list")
    public List<Dept> list()
    {
        return this.deptClientService.list();
    }

    @RequestMapping("/feign/consumer/dept/add")
    public boolean add(Dept dept){
        return deptClientService.add(dept);
    }

}
