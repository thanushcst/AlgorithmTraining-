package com.techinnoveta.java.basic.immutable;

public class Employee {
	private String empId;

	public Employee(String empId) {
		super();
		this.empId = empId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

}
