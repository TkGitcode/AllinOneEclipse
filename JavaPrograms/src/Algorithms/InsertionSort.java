package Algorithms;

public class InsertionSort {
	static void insertionSort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		 int a[]= {4,2,1,4,5,6};
		 
		 insertionSort(a);

	}

}
