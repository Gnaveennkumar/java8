package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
	public static void main(String[] args) {
	List<String> javaCourses =  Arrays.asList("CoreJAVA","SpringBoot","JavaRE");
	
	List<String> uiCourses =  Arrays.asList("Html","Css","Bs");
	
	List<List<String>> courses =  Arrays.asList(javaCourses,uiCourses);
	
//	Stream<String> flatMap = courses.stream().flatMap(s->s.stream());
//	
//	flatMap.forEach(System.out::println);

	courses.stream().flatMap(s->s.stream()).forEach(System.out::println);

	
	}

}
