package com.techinnoveta.java.basic.immutable;

public final class ImmutableEmployee {
	private final String empId;
	
	public ImmutableEmployee(String empId) {
		this.empId = empId;
	}

	public String getEmpId() {
		return empId;
	}
}
