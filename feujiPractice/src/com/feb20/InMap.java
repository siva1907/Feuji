package com.feb20;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class InMap {
	static ArrayList<Customer>maleCust=new ArrayList();
	static ArrayList<Customer>femaleCust=new ArrayList();
	static Map<String,ArrayList<Customer>>map=new LinkedHashMap();
	static ArrayList<Customer> custDb=new ArrayList<>();
	

	public static void main(String[] args) {


	
		Customer c1=new Customer(1,"f","siri");
		Customer c2=new Customer(2,"m","siva");
		Customer c3=new Customer(3,"f","swathi");
		Customer c4=new Customer(4,"m","sai");
		Customer c5=new Customer(5,"f","tara");
		Customer c6=new Customer(6,"m","gouth");
		Customer c7=new Customer(7,"f","devi");
		Customer c8=new Customer(8,"m","karth");
		Customer c9=new Customer(9,"f","sireesha");
		Customer c10=new Customer(10,"m","raj");
		custDb.add(c1);
		custDb.add(c2);
		custDb.add(c3);
		custDb.add(c4);
		custDb.add(c5);
		custDb.add(c6);
		custDb.add(c7);
		custDb.add(c8);
		custDb.add(c9);
		custDb.add(c10);
		
	
		for(Customer c:custDb)
		{
			if(c.getGender().equals("m"))
			{
				maleCust.add(c);	
			}
			else 
			{
				femaleCust.add(c);
			}
		}
		map.put("male",maleCust);
		map.put("female",femaleCust);
		Set<String>gender=map.keySet();
		for(String g:gender)
		{
			System.out.println(map.get(g));
		}
		
		
		
	}

}
