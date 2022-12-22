package com.synechrone.restclient.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechrone.restclient.entity.Department;
import com.synechrone.restclient.repository.DepartmentRepository;
import com.synechrone.restclient.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		department.setId(UUID.randomUUID().toString().split("-")[0]);
		return departmentRepository.save(department);
	}

	public List<Department> findAllDepartments() {
		return departmentRepository.findAll();
	}

	public Optional<Department> getDepartmentById(String depId) throws Exception  {
		Department deparment = null;
		try {

			deparment = departmentRepository.findById(depId).get();
			System.out.println("department by ID " + deparment.getDepartmentName());
		} catch (Exception e) {
			throw new Exception();
		}
		return Optional.of(deparment);
	}

	

}
