package com.el.provider8001.service.impl;

import com.el.parent.entities.Dept;
import com.el.provider8001.mapper.DeptDao;
import com.el.provider8001.mapper.DeptMapper;
import com.el.provider8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Auther: roman.zhang
 * @Date: 2019/4/28 17:14
 * @Version:V1.0
 * @Description:DeptServiceImpl
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Autowired
    private DeptMapper deptMapper ;


    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        List<Dept> deptList = deptDao.findAll();
        Integer [] str=new Integer[4];
        str[0]=1;
        str[1]=2;
        str[2]=3;
        str[3]=4;
        List<Dept> dept11=new ArrayList<>();
        for(int i=1;i<=4;i++){
            Dept dept1 = new Dept();
            dept1.setDname("生成"+i);
            dept1.setId(i);
            dept11.add(dept1);
        }

        Map<Integer, List<Dept>> collect = deptList.stream().collect(Collectors.groupingBy(dept -> dept.getId()));

        for(Dept i:dept11){
            HashMap<Integer, List<Dept>> hashMap = new HashMap<>();

            int id = i.getId();
            List<Dept> depts = collect.get(id);

            for(Dept dept:depts){
                if(hashMap.keySet().contains(dept.getPid())){
                    hashMap.get(dept.getPid()).add(dept);
                }else{
                    List<Dept> list = new ArrayList<>();
                    list.add(dept);
                    hashMap.put(dept.getPid(),list);
                }
            }

            if(hashMap.keySet().contains(id)){
                i.setChildren(hashMap.get(id));
            }

            for(Dept dept:depts){
                int cid = dept.getCid();
                if(hashMap.keySet().contains(cid)){
                    dept.setChildren(hashMap.get(cid));
                }
            }

        }

        return dept11;
    }
}
