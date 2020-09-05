package com.v5ba.nacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate 消费方式
 * @author yiren
 * @date 2019-04-23
 */
@RestController
public class RestTempController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1() {
        return restTemplate.getForObject("http://service-provider/hello", String.class, "张");
    }
}
