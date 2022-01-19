
package com.rajesh.spring.model;

import java.util.ArrayList;

public class User {
	private String userName;
	private String passWord;

	//Glossary gloss=

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("setting username in Userclass as "+userName);
		this.userName = userName;
	}

	public String getPassword() {
		System.out.println("gettikng  password in Userclass as "+passWord);
		return passWord;
	}

	public void setPassword(String password) {
		System.out.println("setting password in Userclass as "+password);
		this.passWord = password;
	}

}
