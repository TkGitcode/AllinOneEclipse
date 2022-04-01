package problems;

public class FibonacciPrime {

	public static void main(String[] args) {
		int n = 0;
		int n1 = 1;

		int val = 10;

		int sum = n + n1;

		int count = 0;
		// System.out.println(n);
		for (int i = 2; i <= val; i++) {
			// System.out.println(sum);
			sum = n + n1;
			if (sum > 1) {
				for (int j = 1; j <= sum; j++) {
					if (sum % j == 0) {
						count++;
					}
				}
				if (count == 2)
					System.out.println(sum);
				count = 0;
			}
			n = n1;
			n1 = sum;

		}

	}

}
