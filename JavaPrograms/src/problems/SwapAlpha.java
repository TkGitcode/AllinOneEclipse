package problems;

public class SwapAlpha {
	static String k="a&k%r$$i";
	
	static int i=0,j=k.length()-1;
	static char c[] =k.toCharArray();
	static void swap(int n1,int n2)
	{
		int temp=c[n1];
	}
	public static void main(String[] args) {
		
		while(j>i)
		{
			if(Character.isAlphabetic(c[j]) && Character.isAlphabetic(c[i]))
			{
				swap(j,i);
			}
			j--;
		}

	}

}
