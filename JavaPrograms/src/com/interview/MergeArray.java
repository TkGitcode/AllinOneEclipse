package com.interview;

import java.util.ArrayList;

public class MergeArray {

	public static void main(String[] args) {

		int a[] = { 4, 5, 9, 13, 15, 17, 19, 25 };
		int b[] = { 4, 8, 9, 11, 16, 17 };
		int i = 0, j = 0;
		ArrayList<Integer> c = new ArrayList<>();

		for (i = 0, j = 0; i < a.length || j < b.length;) {

			if (i == a.length - 1 && j <= b.length - 1) {
				//System.out.println("i" + i + j + "j");
				//System.out.print(b[j]+" "+j);
				c.add(b[j]);
				j++;
			} else if (j == b.length - 1 && i <= a.length - 1) {
				System.out.println(a[i] + " "+i+" ");
				c.add(a[i]);
				i++;
			} else if (i < a.length && j < b.length) {
				if (a[i] == b[j]) {
					c.add(a[i]);
					i++;
					j++;
				} else if (a[i] < b[j]) {

					c.add(a[i]);
					i++;
				} else if (a[i] > b[j]) {
					c.add(b[j]);
					j++;
				}
			} else {
				break;
			}

			// 4,5,8,9,11,13,15,16,17
		}
		System.out.println(c);
	}

}
