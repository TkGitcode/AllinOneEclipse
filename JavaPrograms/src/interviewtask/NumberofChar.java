package interviewtask;

public class NumberofChar {

	public static void main(String[] args) {
		String in = "kumar15v6h6y7";

		String[] inArr = in.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

		for (int i = 1; i <= inArr.length;) {
			int n = Integer.parseInt(inArr[i]);
			for (int j = 0; j < n; j++)
			{ 
                    System.out.print(inArr[i-1]);
			}
			i = i + 2;
			n=0;
		}
//		for(int i=0;i<inArr.length;i++)
//		{
//			System.out.println(inArr[i]);
//		}
//		for(int i=0;i<in.length();i++)
//		{
//			char val=in.charAt(i);
//			if(Character.isDigit(val))
//			{
//				int n=Integer.parseInt(val+"");
//				while(n-- >0)
//				System.out.print(in.charAt(i-1));
//				n=0;
//			}
//		}

	}

}
