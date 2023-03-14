package com.feb23;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpPresent {

	public static void main(String[] args) {
		String s="2023-02-22";
		LocalDate day1=LocalDate.parse(s);
		Employee siva=new Employee("siva", 1, day1, "present");
		Employee siri=new Employee("siri", 2, day1, "absent");
		Employee thara=new Employee("thara", 3, day1, "present");
		Employee swathi=new Employee("swathi",4, day1, "absent");
		Employee poojitha=new Employee("poojitha", 5, day1, "present");


		List<Employee> emps=List.of(siva,siri,thara,swathi,poojitha);

		List<Employee>present=emps.stream().filter(
				(emp)->{
					return "present".equals(emp.status);
				}
				).collect(Collectors.toList());



		Map<LocalDate,List<Employee>> emap=new TreeMap();
		emap.put(day1, present);
		System.out.println(emap);


		//FSI42
		


		Map<LocalDate, List<Employee>> emap2=emps.stream().filter(e->"present".equals(e.getStatus())).
				collect(Collectors.groupingBy(Employee::getDate));
		 

		System.out.println(emap2);
		//

				/*
				 * Map<City, Set<String>> namesByCity
				   = people.stream().collect(
				     groupingBy(Person::getCity,
				                mapping(Person::getLastName,
				                        toSet())));
				 */



		//		Map<LocalDate,List<Employee>> presnties=new TreeMap();
		//		Test t=new Test();
		////		presnties.putAll(t.mapper(day1, emps));
		//		LocalDate day2=day1.plusDays(1);
		//		swathi.setStatus("present");
		//		thara.setStatus("absent");
		//		
		//		presnties.putAll(t.mapper(day2, emps));
		//		System.out.println(presnties);

		




	}

}
