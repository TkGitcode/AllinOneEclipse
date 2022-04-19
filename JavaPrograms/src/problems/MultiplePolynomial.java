package problems;


public class MultiplePolynomial {

	public static void main(String[] args) {
		int a[]= {1,0,3,2};
		int b[]= {2,0,4};
		int c[]=new int[a.length+b.length-1];
		//System.out.println(c.length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				c[i+j]+=a[i]*b[j];
			}
		}
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);

	}

}
