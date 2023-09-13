package com.streamApi;

import java.util.stream.Stream;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person("Shankar", 20000, 1);
		Person p2 = new Person("Suma", 50000, 2);
		Person p3 = new Person("Bindu", 30000, 4);
		Person p4 = new Person("Rajesh", 20000, 13);
		Person p5 = new Person("Rani", 20000, 13);
		
		Stream<Person> p = Stream.of(p1,p2,p3,p4,p5);
		
		p.filter(i->i.salary>=20000).filter(i->i.name.startsWith("R")).filter(i->i.id==13).forEach(i->System.out.println(i));
	}

}
