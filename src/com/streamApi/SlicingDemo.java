package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class SlicingDemo {
	public static void main(String[] args) {
		
		List<String> courses = Arrays.asList("CoreJava","ADVJava","SringBoot","Html","Css","Css","Java","Java","Bs")	;
		
		courses.stream().limit(3).forEach(System.out::println);
		
		System.out.println("*************");
		courses.stream().skip(3).forEach(System.out::println);
		
		System.out.println("*************");
		
		courses.stream().distinct().forEach(System.out::println);
	}

}
