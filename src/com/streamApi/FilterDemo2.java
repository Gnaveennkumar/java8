package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo2 {
	

	public static void main(String[] args) {
		
		List<Integer> l= Arrays.asList(1,2,3,4,5,6);
		
		Stream<Integer> stream = l.stream();
//		stream.filter(i->i%2==0).forEach(i->System.out.println(i));
		stream.filter(i->i%2==1).forEach(i->System.out.println(i));

	}

}
