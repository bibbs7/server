package com.splitit.Models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users") 
	public class User {
    		@Id
    		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "id")
		private Long id;
		@Column(name = "name")
		private String name;
		@Column(name = "password")
		private String password;
		@Column(name = "isAdmin")
		private boolean isAdmin;
		

	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getRole() {
		return isAdmin;
	}

	public void setRole(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}




}
