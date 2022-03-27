package Algorithms;

class SelectionSortAlgoritm {
	int minimum = 0; // To store a Minimum value
	int minIndex = 0; // To store a Minimum value index

	void selectioSort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			minimum = a[i];// Defaultly setting minimum value
			minIndex = i; //// Defaultly setting minimum value Index
			for (int j = i; j < a.length; j++) {
				if (a[j] < minimum) { // if any Array value is less than minimum then minimum value is updated
					minimum = a[j]; // Updating a Minimum value and
					minIndex = j; // Updating a Minimum value Index
				}
			}
			// Swapping a value from present position of array and Final minimum value
			int temp = a[i];
			a[i] = minimum;
			a[minIndex] = temp;
		}
		// function to display a Array
		display(a);
	}

	void display(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}

public class SelectionSortAlgorithm {

	public static void main(String[] args) {
		SelectionSortAlgoritm ssa = new SelectionSortAlgoritm();
		int a[] = { 48, 47, 23, 53, 4, 1, 52, 10, 6, 4, 5, 6, 2, 4, 88, 665, 2, 1 };
		ssa.selectioSort(a); // passing a Array value to function

	}

}
