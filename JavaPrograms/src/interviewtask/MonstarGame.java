package interviewtask;

import java.util.Random;
import java.util.Scanner;

public class MonstarGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm=new Random();
		int row = sc.nextInt();
		int clm = sc.nextInt();
		String place[][] = new String[row][clm];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < clm; j++) {
				place[i][j] = "0";
			}
		}
		//System.out.println("Enter a Gold Position");
		int goldPosi = rm.nextInt(row);
		int goldPosj = rm.nextInt(clm);
		//System.out.println("Enter a Person1 Position");
		int ply1posi = rm.nextInt(row);
		int ply1posj = rm.nextInt(clm);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < clm; j++) {
				if (i == goldPosi && j == goldPosj)
					place[i][j] = "GT";
				if (i == ply1posi && j == ply1posj)
					place[i][j] = "A";
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < clm; j++) {
				System.out.print(place[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
