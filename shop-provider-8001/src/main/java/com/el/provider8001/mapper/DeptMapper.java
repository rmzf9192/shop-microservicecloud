package com.el.provider8001.mapper;

import com.el.parent.entities.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/4/28 17:13
 * @Version:V1.0
 * @Description:DeptDao
 */
//@Mapper
public interface DeptMapper {
    //@Insert("INSERT INTO dept(dname,db_source) VALUES(#{dname},DATABASE());")
    boolean addDept(Dept dept);

   // @Select("select deptno,dname,db_source from dept where deptno=#{deptno}")
    Dept findById(Long id);

    //@Select("select deptno,dname,db_source from dept")
    List<Dept> findAll();
}
