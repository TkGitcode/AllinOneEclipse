package problems;

import java.util.Scanner;

public class NumberToWord {

	static String Tofind(int value, int key) {
		if (key == 1) {
			switch (value) {
			case 1: {
				return "One";
			}
			case 2: {
				return "Two";
			}
			case 3: {
				return "Three";
			}
			case 4: {
				return "Four";
			}
			case 5: {
				return "Five";
			}
			case 6: {
				return "Six";
			}
			case 7: {
				return "Seven";
			}
			case 8: {
				return "Eight";
			}
			case 9: {
				return "Nine";
			}

			}
		}
		if (key == 2) {
			switch (value) {
			case 1: {
				return "Eleven";
			}
			case 2: {
				return "Twelve";
			}
			case 3: {
				return "Thirteen";
			}
			case 4: {
				return "Fourteen";
			}
			case 5: {
				return "Fifteen";
			}
			case 6: {
				return "Sixteen";
			}
			case 7: {
				return "Seventeen";
			}
			case 8: {
				return "Eighteen";
			}
			case 9: {
				return "Nineteen";
			}

			}
		}
		if (key == 3) {
			switch (value) {
			case 1: {
				return "Hundred";
			}
			}
		}
		return "";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[3];
		int i = 0;
		String result = "";
		while (n != 0) {
			int rem = n % 10;
			a[i++] = rem;
			n = n / 10;
		}
		int start = 0;
		int end = a.length - 1;
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		if (a.length == 3) {
			result += " " + Tofind(a[0], 1);
			result += " " + Tofind(1,3);
			result += " " + Tofind(a[1], 2);
			result += " " + Tofind(a[2], 1);

		} else if (a.length == 2) {

		} else if (a.length == 1) {

		} else {
			System.out.println("Updating");
		}

		System.out.println(result);

		for (int j = 0; j < i; j++) {
			System.out.println(a[j]);
		}

	}

}
