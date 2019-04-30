package com.el.provider8001.mapper;

import com.el.parent.entities.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/4/28 21:58
 * @Version:V1.0
 * @Description:DeptDao
 */
public interface DeptDao {
    @Insert("INSERT INTO dept(dname,db_source) VALUES(#{dname},DATABASE());")
    boolean addDept(Dept dept);

    @Select("select deptno,dname,db_source from dept where deptno=#{deptno}")
    Dept findById(Long id);

    @Select("select id,cid,pid, deptno,dname,db_source from dept")
    List<Dept> findAll();
}
