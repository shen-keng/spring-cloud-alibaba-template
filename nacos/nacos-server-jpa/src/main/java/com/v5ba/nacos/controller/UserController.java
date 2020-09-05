package com.v5ba.nacos.controller;

import com.v5ba.nacos.entity.User;
import com.v5ba.nacos.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/hello")
    public String hello(@RequestParam Long id){
        User user = userService.findById(id);
        String result = user == null ? "not found" : user.getUserName();
        return result;
    }
}
