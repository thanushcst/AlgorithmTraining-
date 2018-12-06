package com.techinnoveta.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapImpl {
	public static void main(String args[]) {
		Map<Emplayee, String> map1 = new HashMap<Emplayee, String>();
		Emplayee emp1 = new Emplayee(1, "THANU");
		Emplayee emp2 = new Emplayee(1, "THANU");
		map1.put(emp1, "ADMIN");
		map1.put(emp2, "ADMIN");

		System.out.println("MAP 1 SIZE - " + map1.size());
		for (Map.Entry<Emplayee, String> m : map1.entrySet()) {
			System.out.println(m.getValue());
		}
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);

		map2.put(i1, "ADMIN");
		map2.put(i2, "ADMIN");
		System.out.println("MAP 2 SIZE - " + map2.size());
	}
}

class Emplayee implements Comparable<Emplayee>{
	private int id;
	private String name;

	public Emplayee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println("NAME HASHCODE RESULT - " + name.hashCode());
		System.out.println("HASHCODE RESULT - " + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emplayee other = (Emplayee) obj;
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

	@Override
	public int compareTo(Emplayee o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
