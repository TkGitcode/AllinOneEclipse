package practice;

public class pattern {

	public static void main(String[] args) {
		int n = 5;
		int var = 1;
		int var2 = 2;
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j || j == 0)
					System.out.print(var+" ");
				else {
					if (j < mid - 1) {
						System.out.print(var2 + " ");
						var2++;
					} else {
						System.out.print(j + 1 + " ");
					}
					//System.out.print(" ");

				}
				System.out.print(" ");
			}

			System.out.println();
		}

	}

}
