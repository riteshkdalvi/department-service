package com.synechrone.restclient.service;

import java.util.List;
import java.util.Optional;

import com.synechrone.restclient.entity.Department;

public interface DepartmentService {
	Department saveDepartment(Department department);

	Optional<Department> getDepartmentById(String departmentId) throws Exception;
	
	List<Department> findAllDepartments();
	

}
