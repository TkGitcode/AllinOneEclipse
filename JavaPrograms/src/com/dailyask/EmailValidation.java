package com.dailyask;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
	static boolean validate(String re, String ma) {
		return Pattern.matches(re, ma);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String regexValue = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
				//"^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";
		String matcherValue = scanner.next();
        //System.out.println(Pattern.matches("d","1"));
		System.out.println(validate(regexValue, matcherValue));
		scanner.close();

	}

}
