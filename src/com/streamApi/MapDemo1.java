package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Naveen", 25, 30000.0);
		Employee e2 = new Employee("Ravi", 26, 40000.0);
		Employee e3 = new Employee("Sanjay", 27, 25000.0);
		Employee e4 = new Employee("Mohan", 22, 20000.0);
		Employee e5 = new Employee("Shyam", 23, 50000.0);

       List<Employee> employeenames = Arrays.asList(e1,e2,e3,e4,e5);
       
//       employeenames.stream().filter(i->i.salary>30000.0).map(e->e.age).forEach(System.out::println);
       employeenames.stream().filter(i->i.age>20).map(e->e.name).forEach(System.out::println);

	}

}
