package com.optional.classes;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {

		Customer c = new Customer(100, "naveen", null);

//		String email = c.getEmail();
//		System.out.println(email);

		/*
		 * Optional<String> emailOptional = Optional.of(c.getEmail());
		 * System.out.println(emailOptional);
		 */
//		
//		Optional<String> emailOptional1 = Optional.ofNullable(c.getEmail());
//		System.out.println(emailOptional1);
//		b

		Optional<String> emailOptional2 = Optional.ofNullable(c.getEmail());
		/*
		 * if(emailOptional2.isPresent()) { System.out.println(emailOptional2.get()); }
		 * else { System.out.println("no email data found "); }
		 */

//		System.out.println(emailOptional2.orElse("no email data found"));
		
//		System.out.println(emailOptional2.orElseGet(()->"no email data found"));
		
//		System.out.println(emailOptional2.orElseThrow(()-> new IllegalArgumentException("email data not found")));
		
		
		System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(()->"where is ur email"));
		
		
		

	}
}
