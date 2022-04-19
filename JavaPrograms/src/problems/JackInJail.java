
package problems;

import java.util.Scanner;

public class JackInJail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int jump = scanner.nextInt();
		int fall = scanner.nextInt();
		int NoofWall = scanner.nextInt();
		int heightofWall[] = new int[NoofWall];
		for (int i = 0; i < NoofWall; i++) {
			heightofWall[i] = scanner.nextInt();
		}
		int result = 0;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < NoofWall; i++) {
			result = jump;
			while (result < heightofWall[i]) {
				result = result + jump - fall;
				count++;
			}
			count = count + 1;
			sum += count;
			count = 0;
		}
		System.out.println(sum);
		scanner.close();
	}

}
