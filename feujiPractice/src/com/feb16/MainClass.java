package com.feb16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class MainClass {
	public static void main(String[] args) {
		Student s1;
		Student s2;
		Student s3;
		Student s4;
		s1=new Student(1,"siva",84,"devo");
		s2=new Student(2,"sai",94,"test");
		s3=new Student(3,"me",74,"devolopment");
		s4=new Student(4,"i",64,"BA");

		List<Student> list;
		list=new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println(":::::::::::::::::::");
		Iterator<Student>iterate=list.iterator();
		while(iterate.hasNext())
		{
			Student s=iterate.next();
			System.out.println(s);
		}
		//stack
		List<Student> li=new Stack<Student>();
		li.add(s1);
		li.add(s4);
		li.add(s3);
		li.add(s2);
		System.out.println("-----------------");
		for(Student si:li)
		{
			System.out.println( si);
		}
		System.out.println("=================");
		Iterator<Student>itr=li.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(((Stack)li).pop());
//		}
		System.out.println("*********************");
		List<Student>list2=new Vector();
		list2.add(s1);		
		list2.add(s2);		
		list2.add(s3);		
		list2.add(s4);
		for(int index=0;index<list2.size();index++)
		{
			System.out.println(list2.get(index));
		}
		System.out.println("########################");
		Stack<Student> li2=new Stack<Student>();
		li2.add(s1);
		li2.add(s4);
		li2.add(s3);
		li2.add(s2);
		li2.add(s1);
		li2.add(s1);
		li2.add(s4);
		for(int i=0;i<li2.size();i++)
		{
			System.out.println("size"+li2.size());
			System.out.println(li2.pop());
		}
		System.out.println(".......................");
//		System.out.println(li2.pop());
//		System.out.println(li2.pop());
//		System.out.println(li2.pop());
//		System.out.println(li2.pop());
		Collections.sort(list);
		Collections.sort(li);
		Collections.sort(li2);
		Collections.sort(list2);
		System.out.println("arrayList->"+list);
		System.out.println("stack1->"+li);
		System.out.println("vector->"+list2);
		System.out.println("stack2->"+li2);
		for(int i=0;i<list.size();i++)
		{
			Student s=list.get(i);
			if(s.getName().toString().equals("siva"))
			{
				System.out.println("true...searched"+i);
			}
		}
		
	
	}

}
