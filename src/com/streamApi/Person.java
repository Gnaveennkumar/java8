package com.streamApi;

public class Person {
	String name;
	double salary;
	int id;
	public Person(String name, double salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}
	

}
