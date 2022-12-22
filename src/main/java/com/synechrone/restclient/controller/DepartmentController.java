package com.synechrone.restclient.controller;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.synechrone.restclient.entity.Department;
import com.synechrone.restclient.service.DepartmentService;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {
	 
	@Autowired
    private DepartmentService departmentService;

	
    @PostMapping("/")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
    	System.out.println("task---"+department.getDepartmentAddress());
    	Department savedDepartment = departmentService.saveDepartment(department);
    	 return new ResponseEntity<Department>(savedDepartment, HttpStatus.CREATED);
    }

    @GetMapping("by_department_id/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") String departmentId){
        Optional<Department> department;
		try {
			department = departmentService.getDepartmentById(departmentId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
        return ResponseEntity.ok(department.get());
    }
    
    @GetMapping("/")
    public ResponseEntity<List<Department>> getAllDepartment(){
        List<Department> department;
		try {
			department = departmentService.findAllDepartments();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
        return ResponseEntity.ok(department);
    }
}
