package problems;

import java.util.Stack;

public class FindNextGreater {

	
	
	// 4 , 7 , 3 , 4, 8 ,1
	public static int[]  nextGreater(int a[])
	{
		int[] result=new int[a.length];
		Stack<Integer>  stack=new Stack<>();
		for(int i=a.length-1;i>=0;i--)
		{
			if(!stack.isEmpty())
			{
				while(!stack.isEmpty() && stack.peek() <= a[i])
				{
					stack.pop();
				}
			}
				if(!stack.isEmpty())
					result[i]=stack.peek();
				else
					result[i]=-1;
				stack.push(a[i]);
			
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int a[]= { 4 , 7 , 3 , 4, 8 ,1};
		int arr[]=nextGreater(a);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

}
