package com.techinnoveta.java.basic.design.pattern.adapter;

public class Assignment {

	Pen pen;

	public Assignment(Pen pen) {
		this.pen = pen;
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void writeAssignment(String text) {
		pen.write(text);
	}
}
