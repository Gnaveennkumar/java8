package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {
	public static void main(String[] args) {
		
		List<String> countryNames = Arrays.asList("Japan","India","America","Russia");
		
		/*
		 * Stream<String> map = countryNames.stream().map(names->names.toUpperCase());
		 * 
		 * map.forEach(System.out::println);
		 */
		countryNames.stream().map(names->names.toUpperCase()).forEach(System.out::println);
		
		countryNames.stream().map(names->names.length()).forEach(System.out::println);
		
	}

}
