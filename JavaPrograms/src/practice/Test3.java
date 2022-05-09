package practice;

import java.util.Scanner;

public class Test3 {
	static int len = 6;
	static int digit = 1;
	static int lowerCase = 1;
	static int upperCase = 1;
	static int spclChar = 1;
	static int lenplus=0;

	public static int StrongPass(String pass) {
		if (pass.length() < 6)
			lenplus = 6 - pass.length();
			for (int i = 0; i < pass.length(); i++) {
				char c = pass.charAt(i);
				if (Character.isAlphabetic(c) && Character.isLowerCase(c) && lowerCase != 0) {
					lowerCase--;
				} else if (Character.isAlphabetic(c) && Character.isUpperCase(c) && upperCase != 0) {
					upperCase--;
				} else if (!(Character.isAlphabetic(c)) && spclChar != 0) {
					spclChar--;
				} else if (Character.isDigit(c) && digit != 0) {
					digit--;
				}

			
		}
		return digit + spclChar + lowerCase + upperCase + lenplus;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Stringlen = scanner.nextInt();
		String pass = scanner.next();
		System.out.println(StrongPass(pass));

	}

}
