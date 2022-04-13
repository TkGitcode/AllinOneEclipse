package problems;

public class FindDup {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 2, 3, 4, 5, 6, 6 };
		int j = 0;
		for (int i = 0; i < a.length-1; i++) {
			if(i-1>=0) {
			if (a[i-1] == a[i]) {
				continue;	
			}
			else System.out.println(a[i]);
			}else System.out.println(a[i]);
		}

	}

}
