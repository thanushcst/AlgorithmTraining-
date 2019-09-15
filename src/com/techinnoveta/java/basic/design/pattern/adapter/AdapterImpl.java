package com.techinnoveta.java.basic.design.pattern.adapter;

public class AdapterImpl {
	public static void main(String args[]) {
		PenAdapter penAdapter = new PenAdapter();
		
		Assignment assignment = new Assignment(penAdapter);
		assignment.writeAssignment("Writing Assigmnent");
	}
}
