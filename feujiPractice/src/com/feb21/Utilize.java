package com.feb21;

import com.github.giorgosart.StringUtils;

public class Utilize {
	public static void main(String[] args) {
		Student s=new Student(1,null, null, 3, null);
		
			if(StringUtils.isBlank(s.getFirstname()))
			{
				System.out.println("null");
			}
			else
			{
				
				System.out.println(s.getFirstname().concat(s.getFirstname()));
			}
		SortMap smap=new SortMap();
		

	}

}
