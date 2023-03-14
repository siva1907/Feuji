package com.feb16;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int marks;
	private String dept;
	
	
	public Student(int id, String name, int marks,String dept) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.dept=dept;
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
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + " marks= "+marks+" dept= "+dept+"]";
	}
	
	@Override
	public int compareTo(Student o) {
		
			return this.name.compareTo(o.name);
		
	}
}
