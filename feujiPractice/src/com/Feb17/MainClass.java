package com.Feb17;

import java.util.TreeSet;


public class MainClass {
public static void main(String[] args) {
	TreeSet<Employee>emps;
	emps =new TreeSet<Employee>(new SortbyName());
	Employee e1;
	e1=new Employee(1,"siva");
	Employee e2;
	e2=new Employee(2,"me");
	Employee e3;
	e3=new Employee(3,"s");
	Employee e4;
	e4=new Employee(1,"sai");
	Employee e5;
	e5=new Employee(1,"d");
	Employee e6;
	e6=new Employee(2,"t");
	Employee e7;
	e7=new Employee(3,"h");
	Employee e8;
	e8=new Employee(1,"i");
	Employee e9;
	e9=new Employee(1,"sai");
	Employee e10;
	e10=new Employee(1,"i");
	
	emps.add(e2);
	emps.add(e3);
	emps.add(e1);
	emps.add(e4);
	emps.add(e5);
	emps.add(e6);
	emps.add(e7);
	emps.add(e8);
	emps.add(e9);
	emps.add(e10);
	System.out.println(emps);


}
}
