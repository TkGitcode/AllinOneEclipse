package problems;

public class RightShift {
	static int arr[][] = { { 11, 2, 4, 8 }, { 5, 1, 2, 0 }, { 4, 2, 1, 6 }, { 2, 8, 7, 8 } };

	static void rotateTime(int a[][], int key) {
		for (int i = 1; i <= key; i++)
			TimeLoop(i,key);
		
	}

	static void TimeLoop(int a,int key)
	{
		System.out.println();
		for(int j=0;j<arr.length;j++)
		{
			rotateleft(j,key);
			for(int i=0;i<arr[j].length;i++)
			{
				System.out.print(arr[i][j]+" ");
				//rotateleft(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	static void rotateleft(int pos,int key)
	{
		for(int i=0;i<key;i++)
		{
			int frs=arr[pos][0];
			for(int j=0;j<arr[pos].length;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[pos][arr[pos].length-1]=frs;
		}
	}

	public static void main(String[] args) {

		int key = 3;

		rotateTime(arr, key);

	}

}
