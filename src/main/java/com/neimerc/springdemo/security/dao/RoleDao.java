package com.neimerc.springdemo.security.dao;

import com.neimerc.springdemo.security.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
