package com.greeksforgreeks;

import java.util.*;

public class rotateArray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int n=a.length;
		int m=a[0].length;
		List<Integer> b=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{	
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
