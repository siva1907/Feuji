package com.feb14;

public class Student {
	
	 int marks;
	void marksOperation()
	{	
		marks=(marks/6);
		System.out.println(marks+"inside makrks Operation");
		
	}

	public static void main(String[] args) {
		Student stud=new Student();
		stud.marks=300;
		System.out.println(stud.marks);
		stud.marksOperation();
		System.out.println(stud.marks);
		
	}

}
