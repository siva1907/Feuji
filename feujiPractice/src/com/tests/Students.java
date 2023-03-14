package com.tests;

import java.util.HashMap;
import java.util.Map;



public class Students {
	int age;
	String name;
	boolean b;
	
	@Override
	public String toString() {
		
		return age+" "+name+" "+b;
	}

	@Override
	public int hashCode() {
		return hashCode(age,name);
		
		
	}

	@Override
	public boolean equals(Object obj) {
		Students d=(Students)obj;
		return this.age==d.age&&this.name.equals(d.name);
	}
	
	
	public static void main(String[] args) {
		Students s1=new Students();
		s1.age=19;
		s1.name="sai";
		s1.b=true;
		Students s2=new Students();
		s2.age=19;
		s2.name="s99i";
		s2.b=false;
		System.out.println(s1.name+" "+s1.age);
		System.out.println(s2.name+" "+s2.age);
		Map map=new HashMap();
		map.put(s1,s1.age);
		map.put(s2,s2.age);
		System.out.println(map);
	}

}
