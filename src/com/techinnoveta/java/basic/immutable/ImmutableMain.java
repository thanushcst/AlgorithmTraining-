package com.techinnoveta.java.basic.immutable;

public class ImmutableMain {

	public static void main(String[] args) {
		Employee employee = new Employee("10001");
		ImmutableEmployee immutableEmployee = new ImmutableEmployee("20001");
		System.out.println("Before Change - Employee's Id = " + employee.getEmpId()
							+ " ImmutableEmployee's Id = " + immutableEmployee.getEmpId());
		
		employee.setEmpId("10002");
		System.out.println("After Change - Employee's Id = " + employee.getEmpId()
		+ " ImmutableEmployee's Id = " + immutableEmployee.getEmpId());

	}

}
