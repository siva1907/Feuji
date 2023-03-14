package com.feb21;

public class Student implements Comparable<Student> {
	private int id;
	private String firstname;
	private String lastname;
	private int marks;
	private String dept;
	
	
	public Student(int id, String firstname,String lastname, int marks,String dept) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.marks = marks;
		this.dept=dept;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String name) {
		this.firstname = name;
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

	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + firstname + " marks= "+marks+" dept= "+dept+"]";
	}
	
	@Override
	public int compareTo(Student o) {
		
			return this.id-o.id;
		
	}
}
