package com.spay.controller;

import api_dubbo.api.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboConsumer {
    @Reference(version = "1.0.0")
    private HelloService helloService;

    @RequestMapping("/getHello")
    public String getHello(){
       return helloService.sayHello();
    }


}
