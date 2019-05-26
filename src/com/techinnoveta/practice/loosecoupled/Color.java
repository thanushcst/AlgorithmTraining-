package com.techinnoveta.practice.loosecoupled;

public class Color {
	private String color;

	public Color(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		String convertedColor;
		switch (this.color) {
		case "1":
			convertedColor = "BLUE";
			break;
		case "2":
			convertedColor = "RED";
			break;
		case "3":
			convertedColor = "BLACK";
			break;
		default:
			convertedColor = "Invalid";
			break;
		}
		return convertedColor;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
