package com.yixin.springcloud.controller;

import com.yixin.springcloud.pojo.Dept;
import com.yixin.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//提交Restful服务
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.queryBuId(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }

//团队协作的时候需要用到的
    @GetMapping("/dept/discovery")
    public Object discovery(){
        //获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("discovery==>service"+services);

        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");

        for (ServiceInstance instance: instances){
            System.out.println(
                    instance.getHost()+
                    instance.getPort()+
                    instance.getUri()+
                    instance.getServiceId()

            );
        }
        return client;
    }
}
