package com.techinnoveta.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapImpl {
	public static void main(String args[]) {
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(new Employee(100, "Amit"), "Amit");
		map.put(new Employee(101, "Vijay"), "Vijay");
		map.put(new Employee(102, "Rahul"), "Rahul");

		for (Map.Entry m : map.entrySet()) { 
			Employee emp = (Employee) m.getKey();
			System.out.println( emp.getName() + " " +
			m.getValue()); 
		}
		System.out.println(map.get(new Employee(101, "Vijay")));
	}
}

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
		//return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
