package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesDemo {
	public static void main(String[] args) {
		
		
		  String a = "ILoveWatchingCricketWithMyFriends"; 
		  String[] b = a.split("");
		  
		  List<String> duplicates = Arrays.asList(b);
		 
//		duplicates.stream().distinct().forEach(System.out::println);
		
		duplicates.stream().collect(Collectors.toSet()).forEach(System.out::println);
		
				
	}

}
