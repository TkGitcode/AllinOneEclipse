package com.dailyask;

public class XORproblem {

	static int findmax(int a[]) {
		int max = 0;
		int xorValue = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				xorValue = (a[i] ^ a[j]);
				if (max < xorValue) {
					max = xorValue;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int a[] = { 3, 10, 5, 25, 2, 8 };
		System.out.println(findmax(a));

	}

}
