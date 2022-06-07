package com.yixin.springcloud.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration  //@configuration  ---spring  applicationContext.xml
public class ConfigBean {


    //ribbon 配置负载均衡 实现RestTemplate

    @LoadBalanced  //ribbon
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
