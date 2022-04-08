package com.dailyask;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberValidation {

	static boolean validate(String re, String ma) {
		return Pattern.matches(re, ma);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String regexValue = "[7-9][0-9]{9}";
		String matcherValue = scanner.next();
        //System.out.println(Pattern.matches("d","1"));
		System.out.println(validate(regexValue, matcherValue));
		scanner.close();
	}

}
