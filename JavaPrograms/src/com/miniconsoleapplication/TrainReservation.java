package com.miniconsoleapplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class TrainReservation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int Confirm = 2;
		int TotalWaitingList = 2;
		Stack<String> Ticket = new Stack<>();
		Stack<Integer> WaitingList = new Stack<>();

		int UserChoice = 9;

		do {
			System.out.println("0-To Exit /n 1-BookTicket");
			UserChoice = scanner.nextInt();

			switch (UserChoice) {
			
			case 1 :
			{
				String name = scanner.next();
				if (Confirm > 0) {
					Ticket.put(name, "Confirm");
					Confirm--;
				}
				else if (Confirm <= 0 && TotalWaitingList >= 0) {
					Ticket.put(name, "WaitingList");
					TotalWaitingList--;
				}
				else if (Confirm <= 0 && TotalWaitingList <  0) {
					System.out.println("Sorry there is No Ticket Remaining");
				}
				break;
			}
			case 2:
				String Cname = scanner.next();
				Ticket.remove(Cname);
				break;
			case 3:
				for (String names : Ticket.keySet()) {
					System.out.print(names + " ");
				}
				for (String names : Ticket.values()) {
					System.out.print(names + " ");
				}
				System.out.println();
				break;
			case 0:
				System.exit(0);

			}

		} while (UserChoice != 0);

	}

}
