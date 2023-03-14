package com.feb23;

import java.time.LocalDate;

public class Employee {
	private String name;
	private int id;
	private LocalDate date;
	String status;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", date=" + date + ", status=" + status + "]";
	}
	public Employee(String name, int id, LocalDate date, String status) {
		super();
		this.name = name;
		this.id = id;
		this.date = date;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
