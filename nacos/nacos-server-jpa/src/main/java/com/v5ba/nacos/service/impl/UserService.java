package com.v5ba.nacos.service.impl;

import com.v5ba.nacos.dao.UserRepository;
import com.v5ba.nacos.entity.User;
import com.v5ba.nacos.service.IUserService;
import com.v5ba.nacos.service.remote.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRemote userRemote;

    @Override
    public User findById(Long id) {
        System.out.println(userRemote.hello("张三张"));
        return userRepository.findById(id).orElse(null);
    }
}
