package com.techinnoveta.java.basic.design.pattern.adapter;

public class PenAdapter implements Pen {
	GelPen gelPen = new GelPen();

	@Override
	public void write(String text) {
		gelPen.write(text);
	}

}
