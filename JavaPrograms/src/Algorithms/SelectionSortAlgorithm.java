package Algorithms;

class SelectionSortAlgoritm {
	int minimum = 0; 
	int minIndex = 0; 

	void selectioSort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			minimum = a[i];
			minIndex = i; 
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < minimum) { 
					minimum = a[j]; 
					minIndex = j;
				}
			}
			
			int temp = a[i];
			a[i] = minimum;
			a[minIndex] = temp;
		}
		
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
		ssa.selectioSort(a); 

	}

}
