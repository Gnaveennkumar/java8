package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {

	String name;
	String location;
	String dept;

	Employee(String name, String location, String dept) {
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
}

public class PredicateJoinDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Anil", "Chennai", "DevOps");
		Employee e2 = new Employee("Rani", "Pune", "Networking");
		Employee e3 = new Employee("Ashok", "Hyd", "DB");
		Employee e4 = new Employee("Ganesh", "Hyd", "DB");

		List<Employee> emps = Arrays.asList(e1, e2, e3, e4);

		Predicate<Employee> p1 = (e) -> e.location.equals("Hyd");
		Predicate<Employee> p2 = (e) -> e.dept.equals("DB");
		Predicate<Employee> p3 = (e) -> e.name.startsWith("A");

		// Predicate Joining
		Predicate<Employee> p = p1.or(p2).or(p3);

		for (Employee e : emps) {
			if (p.test(e)) {
				System.out.println(e.name);
			}
		}
	}
}
