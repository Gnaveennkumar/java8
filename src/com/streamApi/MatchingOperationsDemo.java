package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MatchingOperationsDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Naveen", "India");
		Student s2 = new Student("Rani", "America");
		Student s3 = new Student("VAMSI", "Brazil");
		Student s4 = new Student("Ananth", "Japan");
		Student s5 = new Student("Dharani", "England");
		
		List<Student> students = Arrays.asList(s1,s2,s3,s4,s5);
		
		boolean anyIndian = students.stream().anyMatch(p->p.country.equals("India"));
		System.out.println("Any Indian is AVAILABLE :" + anyIndian);
		
		 boolean allIndians = students.stream().allMatch(p->p.country.equals("India"));
			System.out.println("ALL are Indians:"+allIndians);
			
			boolean noneMexico = students.stream().noneMatch(p->p.country.equals("Mexico"));
			System.out.println("none are Mexico:"+noneMexico);
	}

}
