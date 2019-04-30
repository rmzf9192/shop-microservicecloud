package com.el.parent.service;

import com.el.parent.entities.Dept;
import com.el.parent.service.impl.DeptClientServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/3/19 16:43
 * @Version:V1.0
 * @Description:DeptClientService
 */
//@FeignClient(value = "shop-provider-dept")//通过该接口去访问真正的服务接口。
@FeignClient(value = "shop-provider-dept",fallbackFactory= DeptClientServiceFallbackFactory.class)//通过实现FallbackFactory接口在消费端如果有错误，就不访问服务端
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept);
}
