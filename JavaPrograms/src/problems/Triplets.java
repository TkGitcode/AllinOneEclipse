package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Triplets {

//	static ArrayList<Integer> Listarr = new ArrayList<>();
//	static int count = 0;
//
//	static boolean check(int a, int b, int c) {
//		int arr[] = { a, b, c };
//		int val = 0;
//		int i_dup = 0;
//		for (int i = 0; i < Listarr.size(); i = i + 3) {
//			// System.out.println("i value is" + i);
//			for (int j = i; j < 3; j++) {
//				// System.out.println("j value is" + j);
//				// System.out.println(arr[val]);
//				System.out.println(Listarr.get(j));
//				if (arr[val++] == Listarr.get(j)) {
//					// System.out.println("if "+Listarr.get(j) + " "+ arr[val]);
//					count++;
//				}
//			}
//			if (count == 3) {
//				// System.out.println("false");
//				return false;
//			}
//			count = 0;
//			val = 0;
//			i_dup = i;
//		}
//		if (count != 3 && i_dup > Listarr.size() - 2) {
//			return true;
//		}
//		return true;
//	}

	public static void main(String[] args) {
		int a[] = { -1, 0, 1, 2, -1, -4 };
		int pos = 0;
		//Arrays.sort(a);
		LinkedHashSet<List<Integer>> Hash = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = j + 1; k < a.length; k++) {
					if (i != j && i != k && j != k) {
						if (a[i] + a[j] + a[k] == 0) {
							ArrayList<Integer> arr = new ArrayList<>();
							arr.add(a[i]);
							arr.add(a[j]);
							arr.add(a[k]);
							Collections.sort(arr);
							Hash.add(arr);

						}
					}
				}
			}
		}
		System.out.println(Hash);

	}

}
