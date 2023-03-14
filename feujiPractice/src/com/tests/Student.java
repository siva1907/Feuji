package com.tests;

import java.util.ArrayList;

import com.servtest.Studentpogo;

public class Student {
	
	

	public static void main(String[] args) {
		boolean flag = false;
		
		ArrayList<Studentpogo> list= new ArrayList<>();
		
		Studentpogo sp1= new Studentpogo();
		sp1.setId(1);
		sp1.setName("Rajgopal");
		sp1.setStstus("active");
		
		Studentpogo sp2= new Studentpogo();
		sp2.setId(1);
		sp2.setName("Raj");
		sp2.setStstus("unactive");
		
		Studentpogo sp3= new Studentpogo();
		sp3.setId(1);
		sp3.setName("Rajgo");
		sp3.setStstus("active");
		
		list.add(sp1);
		list.add(sp2);
		list.add(sp3);
		int count=0;
		for(Studentpogo e: list)
		{
			if("R".equals(e.getName()))
			{
				System.out.println(e.getName());
			
			}else {
				count++;
			}
			
		}
		if(count==list. size()){
			System.out.println("no");
		}
		
	}

}
