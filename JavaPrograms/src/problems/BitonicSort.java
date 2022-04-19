package problems;

import java.util.ArrayList;
import java.util.Collections;

public class BitonicSort {

	public static void main(String[] args) {
		int a[] = {13,2,4,15,12,10,5};
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		int len = a.length;
		int len1 = 1;
		even.add(a[0]);
		while (len1 <= a.length - 1) {
			if (len1 % 2 == 0) {
				even.add(a[len1]);
				System.out.print("odd  " + a[len1]);
			} else {
				odd.add(a[len1]);
				System.out.print("even  " + a[len1]);
			}
			len1++;
			System.out.println();
		}

		Collections.sort(even);

		Collections.sort(odd);

		Collections.reverse(odd);
		System.out.println(even);
		System.out.println(odd);
		for(int i=0;i<odd.size();i++) {
			even.add(odd.get(i));
		}
		System.out.println(even);
		
		for (int i = 0; i < a.length; i++) {
			a[i]=even.get(i);
			System.out.println(a[i]);
		}

	}

}
