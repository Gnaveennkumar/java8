package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo1 {
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(10,20,30,40,50);
		
	/*for(Integer i : l) {
		if(i>10) {
			System.out.println(i);
		}*/
	Stream<Integer> stream = l.stream();
	/*
	 * Stream<Integer> filter = stream.filter(i->i>10);
	 * filter.forEach(i->System.out.println(i));
	 */
		
	stream.filter(i->i>=10).forEach(i->System.out.println(i));
		
	}

}
