package com.ccy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/2/24.
 */

@RestController
@RefreshScope
public class ProviderHello {

    @Value("${personName}")
    private String appName;


    @RequestMapping("hello")
    public String hello(){
        return "hello:"+appName;
    }
}
