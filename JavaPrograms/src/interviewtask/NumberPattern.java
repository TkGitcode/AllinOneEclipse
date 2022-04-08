package interviewtask;




public class NumberPattern {

	public static void main(String[] args) {
		int n = 5;
		int lo=n;
		int val=0;
		while(lo>0)
		{
			val+=lo;
			lo--;
		}
		System.out.println(val);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; j++) {

				System.out.print(Math.abs((j)));
			}
			System.out.println();
		}
		
	}

}
