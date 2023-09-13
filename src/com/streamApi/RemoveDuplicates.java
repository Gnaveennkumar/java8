package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		String input = "ILoveWatchingCricketWithMyFriends";
		
		String[] arr = input.split("");
		/*
		 * Map<String, Long> map =
		 * Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting()));
		 * 
		 * List<String> duplicates =
		 * map.entrySet().stream().filter(i->i.getValue()==2).map(i->i.getKey()).collect
		 * (Collectors.toList());
		 * 
		 * System.out.println(duplicates);
		 */
		
		List<String> duplicates = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(i->i.getValue()==2)
		.map(i->i.getKey()).collect(Collectors.toList());
		
		System.out.println(duplicates);
		
}
}