package Algorithms;

/*Merge Sort is Divide and Conquer*/
class MergeSortAlgorithm {
	int value = 0;

	void display(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	void merge(int[] a, int leftindex, int rightindex, int midindex) {
		
		int leftarrlen = midindex - leftindex + 1;
		
		int rigtharrlen = rightindex - midindex;
		
		int[] left = new int[leftarrlen];
		int[] right = new int[rigtharrlen];
		
		for (int i = 0; i < leftarrlen; i++) {
			left[i] = a[leftindex + i];
		}
		
		for (int i = 0; i < rigtharrlen; i++) {
			right[i] = a[midindex + 1 + i];
		}
		int i = 0, j = 0, k = leftindex;

		
		while (i < leftarrlen && j < rigtharrlen) {
			if (left[i] <= right[j]) {
				a[k] = left[i];
				i++;
			} else {
				a[k] = right[j];
				j++;
			}
			k++;
		}
		
		while (i < leftarrlen) {
			a[k] = left[i];
			i++;
			k++;
		}
		while (j < rigtharrlen) {
			a[k] = right[j];
			k++;
			j++;
		}
		display(a);

	}

	void mergeSort(int[] a, int leftindex, int rightindex) {
		if (leftindex < rightindex) { 
			
			int midindex = (rightindex + leftindex) / 2;
			
			mergeSort(a, leftindex, midindex);
			
			mergeSort(a, midindex + 1, rightindex);
			
			merge(a, leftindex, rightindex, midindex);
		}
	}
}

public class MergeSort {

	public static void main(String[] args) {
		MergeSortAlgorithm msa = new MergeSortAlgorithm(); 
		int a[] = { 48, 47, 23, 53, 4, 1, 52, 10, 6, 4, 5, 6, 2, 4, 88, 665, 2, 1 };
		msa.mergeSort(a, 0, a.length - 1); 

	}

}
