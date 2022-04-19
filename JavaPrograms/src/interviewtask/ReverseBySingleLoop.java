package interviewtask;

public class ReverseBySingleLoop {
	static int a[] = { 0, 0, 2, 4, 8, 0, 3, 1, 0, 0, 5, 9, 0, 8, 6, 5, 66, 4, 77, 0 };

	public static void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void reverse() {
		int start = 0;
		int end = a.length - 1;
		while (start < end) {
			swap(start, end);
			start++;
			end--;
		}
	}

	public static void moveZeroTolast() {
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			if (a[i] == 0 && a[j] != 0) {
				swap(i, j);
				i++;
				j--;
			} else if (a[i] != 0 && a[j] != 0) {
				i++;
			} else if (a[i] != 0 && a[j] == 0) {
				i++;
				j--;
			} else if (a[i] == 0 && a[j] == 0) {
				j--;
			}
		}

	}

	// 0,0, 2, 4, 8, 0, 3, 1, 0, 5, 9, 0, 8, 6, 5, 66, 4, 77,0
	public static void moveZeroWithoutOrderChange() {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0 && a[j] == 0) {
				swap(i, j);
			}
			if (a[j] != 0) {
				j++;
			}
		}
	}

	public static void main(String[] args) {

		 reverse();
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		// moveZeroTolast();
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		moveZeroWithoutOrderChange();
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		// System.out.println(reverse(a));

	}

}
