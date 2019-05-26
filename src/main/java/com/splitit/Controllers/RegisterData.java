package com.splitit.Controllers;

public class RegisterData {
	
	public String name;
	public String password;
	public boolean isAdmin;
	
	public RegisterData() {	}
	
	public RegisterData(String name, String password, boolean role) {
		this.name = name;
		this.password = password;
		this.isAdmin = role;
	}
	
	private boolean nonEmptyField(String field) {
		return field != null && !field.isEmpty();
	}

	public String getName(){

		return name;
	}
	
	public String getPassword(){
		return password;
	}

	public boolean getRole(){
		return isAdmin;
	}

}