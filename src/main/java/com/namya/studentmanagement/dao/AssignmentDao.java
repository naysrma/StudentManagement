package com.namya.studentmanagement.dao;

import com.namya.studentmanagement.entity.Assignment;

public interface AssignmentDao {
	
	public void save(Assignment assignment);
	
	public void deleteAssignmentById(int id);
}
