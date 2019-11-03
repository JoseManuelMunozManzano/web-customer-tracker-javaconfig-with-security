package com.neimerc.springdemo.security.service;

import com.neimerc.springdemo.security.entity.User;
import com.neimerc.springdemo.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
