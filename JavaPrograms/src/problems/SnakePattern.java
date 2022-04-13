package problems;

public class SnakePattern {

	public static void main(String[] args) {
		int a[][] = { { 11, 2, 4,8 }, { 5, 1, 2,0 }, { 4, 2, 1,6 } ,{2,8,7,8}};
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < a.length; j++) {
					System.out.print(a[i][j] + " ");
				}
			} else {
				for (int j = a.length - 1; j >= 0; j--)
					System.out.print(a[i][j] + " ");
			}
		}

	}

}
