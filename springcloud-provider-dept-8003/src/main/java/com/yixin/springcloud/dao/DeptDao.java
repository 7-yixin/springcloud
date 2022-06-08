package com.yixin.springcloud.dao;

import com.yixin.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(Dept dept);
    public Dept queryBuId(Long id);
    public List<Dept> queryAll();
}
