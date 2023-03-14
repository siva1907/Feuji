package com.feb20;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class StudentMap {
	public static void main(String[] args) {
		Student s1;
		Student s2;
		Student s3;
		Student s4;
		Student s5;
		s1=new Student(1,"siva");
		s2=new Student(2,"sai");
		s3=new Student(3,"swathi");
		s4=new Student(4,"tara");
		s5=new Student(5,"siri");
		Map<Integer,Student>sMap=new ConcurrentHashMap<>();
		sMap.put(s1.getId(),s1);
		sMap.put(s2.getId(),s2);
		sMap.put(s3.getId(),s3);
		sMap.put(s4.getId(),s4);
		sMap.put(s5.getId(),s5);
		Set<Integer>keys=sMap.keySet();
//		System.out.println(sMap);
		for(Integer key:keys)
		{
			System.out.println("id of "+sMap.get(key)+" is"+key);
		}
	}

}
