package com.Feb17;



public class Employee  {
int id;
String name;

public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
//@Override
//public int hashCode() {
//	
//	return this.id;
//}
//@Override
//public boolean equals(Object obj) {
//	Employee emp=(Employee) obj;
//	return this.id==emp.id;
//}
@Override
public String toString() {
	
	return "id "+id+" name "+name;
}



}
