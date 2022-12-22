package com.synechrone.restclient.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "departments")
@Data
public class Department {
	@Id
	private String id;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

}