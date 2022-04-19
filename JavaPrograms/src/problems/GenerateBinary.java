package problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queue<String> queue = new LinkedList<>();
		int n = sc.nextInt();
		queue.add("1");
		String a[] = new String[n];
		for (int i = 0; i < n;i++) { // 1 ->
			a[i] = queue.poll(); // 1
			String n1 = a[i] + "0"; // 10 -> 2
			String n2 = a[i] + "1";
			queue.offer(n1);
			queue.offer(n2); // 11 -> add
		}
		System.out.println(queue);
		for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}

	}
		

}
