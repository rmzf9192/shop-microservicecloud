package com.el.parent.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/3/18 22:13
 * @Version:V1.0
 * @Description:Dept
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable {
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    private int id;
    private int pid;
    private int cid;
    private List<Dept> children;
    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }

}
