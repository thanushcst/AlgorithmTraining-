package com.techinnoveta.java.basic.enumtest;

import java.util.List;

public class EnumMain {

	public static void main(String[] args) {
		List<UserType> userTypes = UserType.getUserTypes();
		for(UserType userType : userTypes){
			System.out.println(userType);
		}

	}

}
