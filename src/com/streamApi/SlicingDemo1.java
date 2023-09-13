package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class SlicingDemo1 {
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(10,20,20,40,10,60);
		
		l.stream().limit(2).forEach(System.out::println);
		System.out.println("@@@@@@@@@");
		
		l.stream().skip(4).forEach(System.out::println);
		System.out.println("@@@@@@@@@");
		
		l.stream().distinct().forEach(System.out::println);
	}

}
