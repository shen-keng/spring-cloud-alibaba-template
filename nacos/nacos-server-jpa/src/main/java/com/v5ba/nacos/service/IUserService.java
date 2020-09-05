package com.v5ba.nacos.service;

import com.v5ba.nacos.entity.User;

public interface IUserService {
    User findById(Long id);
}
