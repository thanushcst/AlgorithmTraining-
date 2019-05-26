package com.techinnoveta.collection.hashmap;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapImpl {
	public static void main(String args[]) {
		Map<Emplayee, String> map1 = new HashMap<Emplayee, String>();
		Emplayee emp1 = new Emplayee(1, "THANU");
		Emplayee emp2 = new Emplayee(1, "THANU");
		map1.put(emp1, "ADMIN");
		map1.put(emp2, "ADMIN");

		// System.out.println("MAP 1 SIZE - " + map1.size());
		for (Map.Entry<Emplayee, String> m : map1.entrySet()) {
			// System.out.println(m.getValue());
		}
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);

		map2.put(i1, "ADMIN");
		map2.put(i2, "ADMIN");
		// System.out.println("MAP 2 SIZE - " + map2.size());

		List<Emplayee> list = new ArrayList<Emplayee>();
		list.add(new Emplayee(1, "THANU"));
		list.add(new Emplayee(2, "KRISHA"));
		list.add(new Emplayee(3, "SUTHA"));
		list.add(new Emplayee(4, "VISHA"));
		list.add(new Emplayee(5, "KAJA"));
		list.add(new Emplayee(6, "SIVA"));
		list.add(new Emplayee(7, "RAJA"));

		Collections.sort(list);
		for (Emplayee emp : list) {
			System.out.println(emp.getName());
		}

		/*Collections.sort(list, new Comparator<Emplayee>() {
			@Override
			public int compare(Emplayee o1, Emplayee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		for (Emplayee emp : list) {
			System.out.println(emp.getName());
		}*/
	}
}

class Emplayee implements Comparable<Emplayee> {
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
	public int compareTo(Emplayee emp) {
		return this.name.compareTo(emp.name);
	}
}
