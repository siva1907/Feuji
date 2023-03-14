package com.feb21;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class SortMap {
	
	{
	Map<Student,Student>students=new HashMap();
	Student s3=new Student(3, "tname", "lastname", 9, "dept");
	Student s1=new Student(1, "firstname", "lastname", 9, "dept");
	Student s2=new Student(2, "fname", "lastname", 9, "dept");
	
	Student s4=new Student(4, "name", "lastname", 9, "dept");
	
		students.put(s1,s1);
		students.put(s2,s2);
		students.put(s3,s3);
		students.put(s4,s4);
		
		TreeSet t=new TreeSet(students.entrySet());
		System.out.println(t);
	
//	Set<Student>skeys=students.keySet();
//	System.out.println();
	}
	

}
