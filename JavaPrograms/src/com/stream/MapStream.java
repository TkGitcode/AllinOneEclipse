package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStream {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 5, 2, 3, 4, 2);

		// It is Code which is happen inside the javaDeveloper Code

		Function<Integer, Integer> f = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * 1;
			}

		};
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer j) {
				return t + j;
			}
		};

		Stream<Integer> vStream = l.stream(); // Here we Convert a List into stream

		Stream<Integer> vMap = vStream.map(f); // And We Map the Stream using Function Interface

		Integer vReduce = (Integer) vMap.reduce(0, b); // Here the Reduce Map Calculate the binary the apply method
														// inside the binary interface
														// (0 is 1st value and b is binary Object)

		System.out.println("1st " + vReduce);

		// Convert into simple code using Lambda

		// Stream<Integer> bMap = bStream.map((t) -> t * 1);
		System.out.println("2nd " + l.stream().map((t) -> t + 1).reduce(0, (c, e) -> c + e)); // c-Carry,e-Value
		System.out.println("3rd " + l.stream().map((t) -> t + 1).reduce(0, Integer::sum)); // We can use call by method

		// Predicate
		List<Integer> list = Arrays.asList(1, 5, 2, 3, 4, 2);

		Predicate<Integer> t = new Predicate<>() {

			@Override
			public boolean test(Integer t) {

				return t % 2 == 0;
			}
		};

		System.out.println("4th " + list.stream().filter(t).reduce(0, Integer::sum));

		// Filter
		list.stream().filter(i -> i % 2 == 0).map(i -> i + 1).forEach(E -> System.out.println("5th forEach" + E));
		// Find First using Method of map
		System.out.println("6th " + list.stream().filter(i -> i % 2 == 0).map(i -> i + 1).findFirst().orElse(0));

		List<Integer> list1 = Arrays.asList(4, 7, 1, 2, 3, 6, 5, 4, 7);
		List<Integer> list2 = new ArrayList<Integer>();

		System.out.println("7th " + list1.stream().filter(e -> e == 2).count());

		list2 = list1.stream().filter(e -> e >= 2).collect(Collectors.toList());

		System.out.println(list2);

		
		// FlatMap
		List<String> lowerCase = Arrays.asList("kumar", "pt", "sin");
		List<String> upperCase = new ArrayList<>();
		upperCase = lowerCase.stream().map(str -> str.toUpperCase()).toList();
		System.out.println(upperCase);

		List<List<String>> lowerUpper = Arrays.asList(lowerCase, upperCase);

		upperCase = lowerUpper.stream().flatMap(k -> k.stream().filter(str -> str.equals("kumar"))).toList();

		System.out.println(upperCase);
		
		
	}

}
