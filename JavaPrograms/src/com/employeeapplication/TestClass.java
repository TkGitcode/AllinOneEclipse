package com.employeeapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface abs {
	default void value() {
		System.out.println("Value");
	}

	void value1();

}

class newClass implements abs {

	@Override
	public void value1() {
		System.out.println("Hii");

	}

}

public class TestClass {

	public static void main(String[] args) {
		newClass newClass = new newClass();
		// newClass.value1();
		List<Integer> list = new ArrayList<>();

		Thread t1 = new Thread(newClass::value1);
		t1.start();

		list.add(7);
		list.add(89);
		list.add(41);

		// Consumer<Integer> c= (Integer i) -> System.out.println(i);

		list.forEach(i -> System.out.println(i));

		List<Integer> value = Arrays.asList(7, 1, 2, 5, 3, 1, 4, 6, 2);
		System.out.println(value.stream().count());
		System.out.println(value.stream().count());

		List<String> lowerCase = Arrays.asList("kumar", "pt", "1452555");
		List<String> upperCase = new ArrayList<>();
		

		upperCase = lowerCase.stream().map(str -> str.toUpperCase()).toList();
		System.out.println(upperCase);
		
		
		List<List<String>> lowerUpper=Arrays.asList(lowerCase,upperCase);
		
		

	}

}
