package com.streamApi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		
//		Stream<Integer> s = Stream.of(12,34,15,16);
//		
//		s.forEach(System.out::println);
		
		ArrayList<String> l = new ArrayList<>();
		
		l.add("navin");
		l.add("ravi");
		l.add("mohan");
		l.add("sanjay");
		l.add("priya");
		Stream<String> stream = l.stream();
		stream.filter(i->i.endsWith("n")).forEach(i->System.out.println(i));
	}
}
