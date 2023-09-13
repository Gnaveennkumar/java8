package com.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee1Demo {
	public static void main(String[] args) {

		List<Employee1> employeeList = new ArrayList<>();

		employeeList.add(new Employee1(1, "Anand", 25, "Male", "Hr", 2015, 13500.0));
		employeeList.add(new Employee1(2, "Gowtham", 27, "Male", "Sales And Marketing", 2016, 25000.0));
		employeeList.add(new Employee1(3, "Naveen", 28, "Male", "InfraStructure", 2017, 18000.0));
		employeeList.add(new Employee1(4, "Rahul", 29, "Male", "Product Development", 2018, 32000.0));
		employeeList.add(new Employee1(5, "Madhu", 26, "Female", "Hr", 2019, 25000.0));
		employeeList.add(new Employee1(6, "Sarayu", 25, "Female", "Security And Transfort", 2020, 28200.0));
		employeeList.add(new Employee1(7, "Pranay", 30, "Male", "Account And Finance", 2016, 26500.0));
		employeeList.add(new Employee1(8, "Rani", 24, "Female", "Sales And Marketing", 2015, 10700.0));
		employeeList.add(new Employee1(9, "Vamsi", 25, "Male", "Hr", 2021, 25000.0));
		employeeList.add(new Employee1(10, "Dharani", 28, "Female", "Product Development", 2022, 12500.0));

//		1.How many male and female employees are there in the organization?
		Map<String, Long> employees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
		System.out.println(employees);

		System.out.println("**********************************************");
		// 2)write a java code to print all departments in the organization?
		employeeList.stream().map(Employee1::getDepartment).distinct().forEach(System.out::println);

		System.out.println("**********************************************");
		// 3)write a java code to print average age of male and female employees?
		Map<String, Double> avgOfMaleAndfemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee1::getGender, Collectors.averagingInt(Employee1::getAge)));
		System.out.println(avgOfMaleAndfemaleEmployees);

		System.out.println("**********************************************");
		// 4)write a java code to print highest paid employee in the organization?
		Optional<Employee1> highestPaidEmployee = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee1::getSalary)));
		System.out.println(highestPaidEmployee.get().getName());

		System.out.println("**********************************************");
		// 5) write a java code get all employees who joined after 2015?
		employeeList.stream().filter(i -> i.yearOfJoining > 2015).map(Employee1::getName).forEach(System.out::println);

		System.out.println("**********************************************");
		// 6) Count the number of employees in each department?
		Map<String, Long> countByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy((Employee1::getDepartment), Collectors.counting()));
		System.out.println(countByDepartment);

		System.out.println("**********************************************");
		// 7) What is the average salary of each department?
		Map<String, Double> averageSalaryOfEachDepartment = employeeList.stream().collect(
				Collectors.groupingBy((Employee1::getDepartment), Collectors.averagingDouble(Employee1::getSalary)));
		System.out.println(averageSalaryOfEachDepartment);

		System.out.println("**********************************************");
		// 8) Get the details of youngest male employee in organization?
		Optional<Employee1> youngestMaleEmployee = employeeList.stream().filter(i -> i.gender == "Male")
				.collect(Collectors.minBy(Comparator.comparing(Employee1::getAge)));
		System.out.println(youngestMaleEmployee.get().name);

		System.out.println("**********************************************");
		// 9) Who has the most working experience in the organization?
		Optional<Employee1> mostWorkingExperience = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing((Employee1::getYearOfJoining))));
		System.out.println(mostWorkingExperience.get().name);

		System.out.println("**********************************************");
		// 10)How many male and female employees are there in the Sales And Marketing
		// team?
		Map<String, Long> maleAndFemaleEmployeesInSalesAndMarketing = employeeList.stream()
				.filter(e -> e.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy((Employee1::getGender), Collectors.counting()));
		System.out.println(maleAndFemaleEmployeesInSalesAndMarketing);

		System.out.println("**********************************************");
		// 11)what is the average salary of male and female employees?
		Map<String, Double> averageSalaryOfMaleAndFemaleEmployees = employeeList.stream().collect(
				Collectors.groupingBy((Employee1::getGender), Collectors.averagingDouble(Employee1::getSalary)));
		System.out.println(averageSalaryOfMaleAndFemaleEmployees);

		System.out.println("**********************************************");
		// 12)List down the names of all employees in each department?
		Map<String, List<Employee1>> employeeListByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee1::getDepartment));

		Set<Entry<String, List<Employee1>>> entrySet = employeeListByDepartment.entrySet();

		for (Entry<String, List<Employee1>> entry : entrySet) {
			System.out.println("--------------------------------------");

			System.out.println("Employees In " + entry.getKey() + " : ");

			System.out.println("--------------------------------------");

			List<Employee1> list = entry.getValue();

			for (Employee1 e : list) {
				System.out.println(e.getName());
			}
		}

		System.out.println("**********************************************");
		// 13) What is the average salary and total salary of the whole organization?
		DoubleSummaryStatistics AvgSalaryAndTotalSalary = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee1::getSalary));
		System.out.println("Average salary :" + AvgSalaryAndTotalSalary.getAverage());
		System.out.println("sum of whole salary :" + AvgSalaryAndTotalSalary.getSum());

		System.out.println("**********************************************");
		// 14) Separate the employees who are younger or equal to 25 years from those
		// employees who are older than 25 years.
		List<String> younger = employeeList.stream().filter(i -> i.getAge() <= 25).map(e->e.getName()).collect(Collectors.toList());

		System.out.println(younger);
		List<String> older = employeeList.stream().filter(i -> i.getAge() > 25).map(e->e.getName()).collect(Collectors.toList());
		System.out.println(older);
		
		
		System.out.println("**********************************************");
		// 15) Who is the oldest employee in the organization? What is his age and which
		// department he belongs to?
		Optional<Employee1> oldestEmployee = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee1::getAge)));
		System.out.println("Name ->" + oldestEmployee.get().getName());
		System.out.println("Age ->" + oldestEmployee.get().getAge());
		System.out.println("Department ->" + oldestEmployee.get().getDepartment());

		System.out.println("**********************************************");
		// 16)who is the second highest salary employee
		  Optional<Employee1> findFirst = employeeList.stream().sorted(Comparator.comparing(Employee1::getSalary).reversed()).skip(1).findFirst();
				if(findFirst.isPresent()) {
					Employee1 second = findFirst.get();
					System.out.println(second.getName());
				}
		

	}

}
