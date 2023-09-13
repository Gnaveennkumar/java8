package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(3,5,7,9,12);
		
		//l.stream().map(m->m*3).forEach(System.out::println);
		//l.stream().map(m->m>3).forEach(System.out::println);
		
		//l.stream().map(m->m%2==0).forEach(System.out::println);
		l.stream().map(m->m%2==1).forEach(System.out::println);
	}

}
