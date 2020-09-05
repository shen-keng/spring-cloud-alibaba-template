package com.v5ba.nacos;

import com.v5ba.nacos.config.SmsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

    @RefreshScope
    @RestController
    static class DemoController {

        /**
         * 直接获取 nacos 中的参数
         */
        @Value("${user.name}")
        String userName;

        @Value("${user.age}")
        int age;
        @Autowired
        private SmsConfig smsConfig;

        @GetMapping("/hello")
        public String hello(){
            System.out.println(smsConfig.getChannel());
            return userName + age;
        }
    }
}
