package Algorithm;

public class SortedArrayFindPosition {

	static int first(int a[], int L, int H, int target) {

		if (H >= L) {
			int mid = L + (H - L) / 2;
			if ((mid == 0 || target > a[mid - 1]) && a[mid] == target)
				return mid;
			else if (target > a[mid])
				return first(a, (mid + 1), H, target);
			else
				return first(a, L, (mid - 1), target);
		}
		return -1;

	}

	static int last(int a[], int L, int H, int target) {

		if (H >= L) {
			int mid = L + (H - L) / 2;
			if ((mid == a.length - 1 || target < a[mid + 1]) && a[mid] == target)
				return mid;
			else if (target < a[mid])
				return last(a, L, (mid - 1), target);
			else
				return last(a, (mid + 1), H, target);
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 4, 5, 5, 5, 5, 5, 6, 7 };
		int target = 5;
		int end = a.length;
		int start = 0;

		System.out.println(first(a, start, end - 1, target));
		System.out.println(last(a, start, end - 1, target));

	}

}
