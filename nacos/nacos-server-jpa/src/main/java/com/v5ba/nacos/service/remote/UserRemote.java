package com.v5ba.nacos.service.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-provider")
public interface UserRemote {
    @GetMapping("hello")
    String hello(@RequestParam("name") String name);
}
