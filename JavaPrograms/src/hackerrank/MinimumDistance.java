package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumDistance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int val;
		int a[]=new int[n];
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0,j=n-1; i<j;i++,j--)
		{
			if(a[i]==a[j])
			{
				val=j-i;
				al.add(val);
				continue;
			}
//			else
//			{
//				break;
//			}
			
		}
		if(al.isEmpty())
			System.out.println(-1);
		else
		System.out.println(a[Math.abs((al.get(0))-(al.get(1)))]);
			

	}

}
