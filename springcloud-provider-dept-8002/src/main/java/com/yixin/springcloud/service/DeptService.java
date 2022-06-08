package com.yixin.springcloud.service;

import com.yixin.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {

    public boolean addDept(Dept dept);
    public Dept queryBuId(Long id);
    public List<Dept> queryAll();

}

