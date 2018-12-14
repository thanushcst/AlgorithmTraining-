package com.techinnoveta.java.basic.design.pattern.factory;

public enum CarType {
	TOYATO("Toyata"), 
	BMW("BMW"), 
	AUDI("Audi");

	private final String description;

	public String getDescription() {
		return description;
	}

	private CarType(String description) {
		this.description = description;
	}

}
