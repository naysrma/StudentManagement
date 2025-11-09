package com.namya.studentmanagement.dao;

import com.namya.studentmanagement.entity.Role;

public interface RoleDao {
	
	public Role findRoleByName(String theRoleName);
}
