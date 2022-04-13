package problems;

import java.util.Scanner;

public class WithoutArray {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = sc.nextInt(), val2 = 1, val1 = 1;
		for (int i = 1; i <= n; i++) {
			for(int k=n1;k<=n;k++)
			{
				val1++;
			}
			for (int j = 1; j < n1; j++) {
				System.out.print(val1++ + " ");
			}
			for (int j = n1; j <= n; j++) {
				System.out.print(val2++ + " ");
			}
			val2=val1;
			System.out.println();
		}
		sc.close();

	}

}
