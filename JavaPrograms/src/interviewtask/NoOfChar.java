package interviewtask;

public class NoOfChar {

	public static void main(String[] args) {
		String in = "aabbccdd";
		int dup = 0;
		String result = "";

		for (int i = 0; i < in.length();) {
			int n = in.lastIndexOf(in.charAt(i));
			
			result += in.charAt(i);
			System.out.print(result);
			if(i==0)
			System.out.print(n+1 - dup);
			else 
				System.out.print(n - dup);
			dup = n;
			result = "";
			i = n + 1;
		}

//		for(int i=0;i<in.length()-1;)
//		{
//			if(in.charAt(i)==in.charAt(i+1))
//			{
//			while(in.charAt(i)==in.charAt(i+1) && i<in.length()-1)
//			{
//				System.out.print(in.charAt(i));
//				i++;
//			}
//			System.out.println();
//			}
//			else {
//				i++;
//			}
//			
//			
//		}
//			n=i+1;
//			while(in.charAt(i)==in.charAt(n) && n<in.length()-1)
//			{
//				n=n+1;
//				count++;
//			}
//			result+=in.charAt(i);
//			System.out.println(result+count);
//			count=0;
//			i=n;

	}

}
