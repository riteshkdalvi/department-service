package com.synechrone.restclient.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.synechrone.restclient.entity.*;;

public interface DepartmentRepository extends MongoRepository<Department,String> {

	/*
	 * List<Department> findBySeverity(int severity);
	 * 
	 * @Query("{ assignee: ?0 }") List<Department> getTasksByAssignee(String
	 * assignee);
	 */
}

