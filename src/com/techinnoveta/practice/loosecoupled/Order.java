package com.techinnoveta.practice.loosecoupled;

import java.util.List;

public class Order implements JSONWriter{
	private List<Product> products;
	private String id;

	public Order(String id, List<Product> products) {
		this.id = id;
		this.products = products;
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String write(Object object) {
		
		 return null;
	}
}
