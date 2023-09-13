package com.streamApi;

import java.util.stream.Stream;

public class UserTest {
	public static void main(String[] args) {
		
		User u1 = new User("Ashok", 25);
		User u2 = new User("kiran", 28);
		User u3 = new User("Abhi", 29);
		User u4 = new User("Priya", 23);
		User u5 = new User("Navin", 25);
		
		Stream<User>  u = Stream.of(u1,u2,u3,u4,u5);
//		u.forEach(System.out::println);
//		u.filter(i->i.age>25).forEach(System.out::println);
		
		u.filter(i->i.name.endsWith("n")).filter(i->i.age>=25).forEach(System.out::println);
	}

}
