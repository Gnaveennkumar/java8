package com.streamApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamExamples {
	public static void main(String[] args) throws IOException {

//		1.print Integers Using Integers Stream?

		IntStream.range(0, 10).forEach(System.out::println);
		System.out.println("========================================");

//		2.Integer stream With skip?

		IntStream.range(0, 10).skip(5).forEach(System.out::println);
		System.out.println("========================================");

//		3.Integer stream With Sum?

		int sum = IntStream.range(0, 10).sum();
		System.out.println(sum);
		System.out.println("========================================");

//		4.Stream.of,sorted and FindFirst?

		Optional<String> findFirst = Stream.of("Naveen", "ARUN", "Latha", "anusha").sorted().findFirst();
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
		System.out.println("========================================");

//		5.Stream from Array Sort,Filter and print?

		String[] names = { "Ajay", "Rani", "Kiran", "Mahesh", "Bhumika", "Raji", "Revanth" };
		Arrays.stream(names).filter(i -> i.startsWith("R")).sorted().forEach(System.out::println);
		System.out.println("========================================");

//		6.Average of Squares an integer?

		Arrays.stream(new int[] { 2, 3, 4, 5, 6, 7 }).map(x -> x * x).average().ifPresent(System.out::println);
		System.out.println("========================================");

//		7.Stream from List map,filter,sort and print?

		List<String> list = Arrays.asList("Ankit", "Devi", "Ramu", "naveen", "Srikanth", "Prathyusha", "Ramadevi",
				"Kiran");
		list.stream().map(String::toLowerCase).filter(x -> x.startsWith("n")).forEach(System.out::println);
		System.out.println("========================================");

//		8.Stream Rows From a Test file sort,filter,print?

		Stream<String> singers = Files.lines(Paths.get("singers.txt"));
		singers.sorted().filter(x -> x.length() > 8).forEach(System.out::println);
		singers.close();
		System.out.println("========================================");

//		9.stream rows from the text file and save to list?

		List<String> sheran = Files.lines(Paths.get("singers.txt")).filter(x -> x.contains("Sheran"))
				.collect(Collectors.toList());
		System.out.println(sheran);

		System.out.println("========================================");

//		10.stream rows from csv file(data.txt) and count?

		long rows = Files.lines(Paths.get("data.txt")).map(x -> x.split(",")).filter(x -> x.length == 3).count();
		System.out.println(rows);

		System.out.println("========================================");

//		11.stream rows from csv file,parse data from rows?

		Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
		rows2.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[1]) > 10)
				.forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
		rows2.close();
		System.out.println("========================================");

//		12.stream rows from csv file,store fields in HashMap?

		Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
		Map<String, Integer> map = new HashMap<>();
		map = rows3.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[1]) > 10)
				.collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[1])));
		System.out.println(map);
		rows3.close();
		System.out.println("========================================");

//		13.Reduction sum?

		Integer reduce = Stream.of(1, 2, 3, 4, 5).reduce(1, (Integer c, Integer b) -> c + b);
		System.out.println(reduce);
		System.out.println("========================================");

//		14.reduce summarystatistics?
		IntSummaryStatistics summaryStatistics = IntStream.of(1, 2, 3, 4, 5).summaryStatistics();
		System.out.println(summaryStatistics);
		System.out.println("========================================");

//		15.write a java8 stream api code to get the sum of second max and second min?

		int[] arr = { 1, -5, 3, 14, -2, 17, 19 };

		int secondMin = Arrays.stream(arr).sorted().skip(1).findFirst().getAsInt();

		/*
		 * if (findFirst2.isPresent()) { int secondMin = findFirst2.getAsInt();
		 * System.out.println("SecondMin : " + secondMin);
		 */

		int secondMax = Arrays.stream(arr).sorted().skip(arr.length - 2).findFirst().getAsInt();

//		List<Integer> list3 = Arrays.asList(-2, 14);
//		Integer sumMinMix = list3.stream().reduce(0, (Integer a, Integer b) -> a + b);
		
       sum= secondMin+secondMax;
       
       System.out.println("secondMin:"+	secondMin+"\nsecondMin:"+secondMax+"\nsum :"+sum);
	}

}

