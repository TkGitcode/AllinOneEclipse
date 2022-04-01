package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GameFourte {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, String> operatorHshmp = new HashMap<>();
		HashMap<Integer, Integer> numberHshmp = new HashMap<>();

		ArrayList<String> combinastion = new ArrayList<>();
		// Operator into HashMap
		operatorHshmp.put(1, "+");
		operatorHshmp.put(2, "-");
		operatorHshmp.put(3, "*");
		operatorHshmp.put(4, "/");
		operatorHshmp.put(5, "(");
		operatorHshmp.put(6, ")");
		System.out.println("Enter a Four Value");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();
		int number4 = scanner.nextInt();
		// numbers into HashMap
		numberHshmp.put(1, number1);
		numberHshmp.put(2, number2);
		numberHshmp.put(3, number3);
		numberHshmp.put(4, number4);
		// Enter a OutPut Value
		System.out.println("Enter a OutPut Value");
		int outputValue = scanner.nextInt();

		int validatingValue = 0;
		while (validatingValue != outputValue) {
			System.out.println(operatorHshmp);
			System.out.println(numberHshmp);

			for (int i = 1; i < 4; i++) {
				for (int j = 1; j < 4; j++) {
					for (int k = 1; k < 4; k++) {
						for (int l = 1; l < 4; l++) {
							if (i != j && j != k && k != l && l != i)
							{
								System.out.println(numberHshmp.get(i) + " " + numberHshmp.get(j) + " "
										+ numberHshmp.get(k) + " " + numberHshmp.get(l));
							validatingValue = numberHshmp.get(i) + numberHshmp.get(j) + numberHshmp.get(k)
									+ numberHshmp.get(l);
							}
						}
					}
				}
			}

		}
		scanner.close();
	}

}
