package problems;

public class SecondMaxElement {

	public static void main(String[] args) {
		int a[] = { 1, 7, 3, 6, 5 };
		int max1 = 0;
		int max2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max1) {
				max2 = max1;
				max1 = a[i];
			} else if (a[i] > max2) {
				max2 = a[i];
			}
		}
		System.out.println(max2);

	}

}
