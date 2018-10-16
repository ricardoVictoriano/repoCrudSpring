package com.ricardovictoriano.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	private String fullName;
	private String address;
	private String email;
	private double salary;
	

	
	public User() {
	}



	public User(String fullName, String address, String email, double salary) {
		this.fullName = fullName;
		this.address = address;
		this.email = email;
		this.salary = salary;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", address=" + address + ", email=" + email + ", salary="
				+ salary + "]";
	}
	
	
	
	
	
	
	
	

}
