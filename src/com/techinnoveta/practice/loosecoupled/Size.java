package com.techinnoveta.practice.loosecoupled;

public class Size {
	private String size;

	public String getSize() {
		String convertedSize;
		switch (this.size) {
		case "1":
			convertedSize = "I";
			break;
		case "2":
			convertedSize = "II";
			break;
		case "3":
			convertedSize = "III";
			break;
		default:
			convertedSize = "Invalid";
			break;
		}
		return convertedSize;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
