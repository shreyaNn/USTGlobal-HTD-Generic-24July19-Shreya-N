package com.dev.collections;

public class Employee {
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + ", password=" +" null"+ "]";
	}

	private String name;
	private String id;
	private String email;
	private String password;




public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public void setPassword(String password) {
	this.password = password;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}



	
}
