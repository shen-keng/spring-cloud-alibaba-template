package com.v5ba.nacos.dao;

import com.v5ba.nacos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
