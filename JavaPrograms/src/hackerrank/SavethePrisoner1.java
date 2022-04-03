package hackerrank;

import java.util.Scanner;

public class SavethePrisoner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		for (int i = 0; i < len; i++) {
			int n = sc.nextInt();// Man
			int m = sc.nextInt();// Foot
			int s = sc.nextInt();// start
			int rem = m % n;
			if ((rem + s - 1) % n == 0) {
				System.out.println(n);
			} else {
				System.out.println((rem + s - 1) % n);
			}
		}

		sc.close();

	}

}
