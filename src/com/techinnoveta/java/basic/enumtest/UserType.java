package com.techinnoveta.java.basic.enumtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum UserType {
	SUPPER_ADMIN("01", "SUPPER ADMIN"), 
	ADMIN("02", "ADMIN"), 
	SYSTEM_ADMIN("03", "SYSTEM ADMIN"), 
	USER("01", "USER"), 
	GUEST("01", "GUEST");

	private String typeId;
	private String type; 
	
	private static List<UserType> userTypes = new ArrayList<UserType>();
	
	private UserType(String typeId, String type) {
		this.typeId = typeId;
		this.type = type;
	}

	public static List<UserType> getUserTypes() {
		for(UserType userType : UserType.values()) {
			System.out.println(UserType.valueOf(userType.toString()).getTypeId());
		}
		return userTypes;
	}

	public String getTypeId() {
		return typeId;
	}

	public String getType() {
		return type;
	}
}
