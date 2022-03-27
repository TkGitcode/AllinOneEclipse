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
		// length for left array
		int leftarrlen = midindex - leftindex + 1;
		// length for Right array
		int rigtharrlen = rightindex - midindex;
		// Creating a Array
		int[] left = new int[leftarrlen];
		int[] right = new int[rigtharrlen];
		// Storing left half to Left Array
		for (int i = 0; i < leftarrlen; i++) {
			left[i] = a[leftindex + i];
		}
		// Storing Right half to Right Array in
		for (int i = 0; i < rigtharrlen; i++) {
			right[i] = a[midindex + 1 + i];
		}
		int i = 0, j = 0, k = leftindex;

		// last element of 1st half or last element of 2nd half become more than
		// length,The while loop will End
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
		// Here the both while doing if there is Extra Element after above while done
		// the element will add to particular array
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
		if (leftindex < rightindex) { // Condition works Until Separating into single element of Array
			// Finding Mid value of Separated Array
			int midindex = (rightindex + leftindex) / 2;
			// Using Recursion Splitting a First Half of Array
			mergeSort(a, leftindex, midindex);
			// Using Recursion Splitting a Second Half of Array
			mergeSort(a, midindex + 1, rightindex);
			// Using merge function merging a splitted value
			merge(a, leftindex, rightindex, midindex);
		}
	}
}

public class MergeSort {

	public static void main(String[] args) {
		MergeSortAlgorithm msa = new MergeSortAlgorithm(); // Creating a Object for a class
		int a[] = { 48, 47, 23, 53, 4, 1, 52, 10, 6, 4, 5, 6, 2, 4, 88, 665, 2, 1 };
		msa.mergeSort(a, 0, a.length - 1); // Passing a Parameter (Array,StartPoint,EndPoint)

	}

}
