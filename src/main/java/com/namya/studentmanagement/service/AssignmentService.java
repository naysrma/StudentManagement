package com.namya.studentmanagement.service;

import com.namya.studentmanagement.entity.Assignment;

public interface AssignmentService {
	
	public void save(Assignment assignment);
	
	public void deleteAssignmentById(int id);
}
