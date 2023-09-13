package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo3 {
	public static void main(String[] args) {
		
		List<String> l = Arrays.asList("Naveen","Ravi","Rani","Shyam");
		
		Stream<String> stream = l.stream();
		
//		stream.filter(i->i.startsWith("N")).forEach(i->System.out.println(i));
		
		stream.filter(i->i.endsWith("i")).forEach(i->System.out.println(i));

	}

}
