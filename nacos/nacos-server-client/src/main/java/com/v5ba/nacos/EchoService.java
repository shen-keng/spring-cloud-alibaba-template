package com.v5ba.nacos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yiren
 * @date 2019-04-23
 */
@FeignClient(name = "service-provider")
public interface EchoService {
    @GetMapping("hello")
    String hello(@RequestParam("name") String name);
}
