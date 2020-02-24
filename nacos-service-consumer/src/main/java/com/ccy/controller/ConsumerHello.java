package com.ccy.controller;

import com.ccy.feign.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/2/24.
 */

@RestController
public class ConsumerHello {

    @Autowired
    private HelloClient helloClient;


    @RequestMapping("hello")
    public String hello(){
        return "consumer client : "+helloClient.hello();
    }
}
