package com.neimerc.springdemo.security.dao;

import com.neimerc.springdemo.security.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
    void save(User user);
    
}
