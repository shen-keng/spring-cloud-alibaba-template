package com.v5ba.nacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign 消费方式
 * @author yiren
 * @date 2019-04-23
 */
@RestController
public class FeignClientController {

    @Autowired
    private EchoService echoService;

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2() {
        return echoService.hello("张彦");
    }
}
