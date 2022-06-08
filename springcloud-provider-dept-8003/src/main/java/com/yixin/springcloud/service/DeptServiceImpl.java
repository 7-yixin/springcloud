package com.yixin.springcloud.service;

import com.yixin.springcloud.dao.DeptDao;
import com.yixin.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryBuId(Long id) {
        return deptDao.queryBuId(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
