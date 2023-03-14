package com.servtest;

public class Studentpogo {

	private int id;
	private String name;
	private String ststus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStstus() {
		return ststus;
	}
	public void setStstus(String ststus) {
		this.ststus = ststus;
	}
	@Override
	public String toString() {
		return "Studentpogo [id=" + id + ", name=" + name + ", ststus=" + ststus + "]";
	}
}
