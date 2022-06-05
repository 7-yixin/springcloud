package com.yixin.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)  //链式写法,默认是chain=false
public class Dept implements Serializable {

    private long deptno;  //主键
    private String dname;
    //这个数据库存在哪个数据库的字段
    //微服务  一个服务对应一个数据库， 同一个信息可能存在不同的数据库  所以需要做区分
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
    /*
    * 链式写法
    * Dept dept = new Dept()
    * dept.setDeptno("11").setDname("人事部").setDb_source("001")
    * */

}
