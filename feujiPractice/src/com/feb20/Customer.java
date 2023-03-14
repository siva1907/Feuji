package com.feb20;

public class Customer {
	private int id;
	private String gender;
	private String name;
	
	public Customer(int id, String gender, String name) {
		super();
		this.id = id;
		this.gender = gender;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", gender=" + gender + ", name=" + name + "]";
	}
	

}
