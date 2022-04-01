package Algorithms;

public class BubbleSort {

	
	static void bubbleSort(int a[])
	{
		boolean check=false;
		for(int i=1;i<a.length;i++)
		{
			check=false;
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j]>a[j+1])
				{
					check=true;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			if(check == false)
				break;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		
		 int a[]= {1,2,3,4,5,6};
		 
		 bubbleSort(a);

	}

}
