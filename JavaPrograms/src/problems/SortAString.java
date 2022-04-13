package problems;

import java.util.HashMap;
import java.util.Scanner;

public class SortAString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		HashMap<String,String> hm=new HashMap<>();
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			String in=scanner.next();
			String strInt=in.substring(2);
			String[] str=in.split("-");
			hm.put(str[0],strInt);
		}
		for(int i=1;i<=hm.size();i++)
		{
			System.out.print(hm.get(""+i)+" ");
		}
		scanner.close();
		

	}

}
