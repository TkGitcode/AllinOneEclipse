package com.interview;

public class DuplicateArrayPosition {

	public static void main(String[] args) {
		int a[] = { 4, 7, 5, 1, 1, 3 };
		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		int min;
		int minPos;
		int flag = 0;
		for (int i = 0; i < a.length; i++) {
			min = a[i];
			minPos = i;

			for (int j = i; j < a.length; j++) {
				if (a[j] <= min) {
					minPos = j;
					min = a[j];
					flag = 1;
				}
			}
			if (flag == 1) {
				int temp = a[i];
				a[i] = a[minPos];
				a[minPos] = temp;
				flag = 0;
			}

		}
		
		// 4, 7, 5, 1, 1, 3
		//1 1 3  4 5 7
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				if (a[i] != a[j]) {
					a[j] = a[i];
					j++;
				}
			} else {
				a[j] = a[i];
				j++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int k = 0; k < j; k++) {
				if (b[i] == a[k]) {
					System.out.println(k);
					break;
				}
			}
		}
		// 4, 7, 5, 1, 1, 3
		// 1 3 4 5 7

		// 2 4 3 0 0 1
	}

}
