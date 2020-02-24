package com.ccy.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2020/2/24.
 */

@FeignClient("nacos-service-provider")
public interface HelloClient {

    @RequestMapping("hello")
    public String hello();
}
