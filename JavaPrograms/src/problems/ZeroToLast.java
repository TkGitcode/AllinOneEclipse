package problems;

public class ZeroToLast {

	static int a[] = { 1, 0, 3, 0, 9, 0, 4, 0, 5, 1, 3, 0, 1, 0 };
	static int i = 0;
	static int j = a.length - 1;

	static void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {

		while (i < j) {
			while (a[i] != 0)
				i++;
			while (a[j] == 0)
				j--;

			swap(i, j);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
