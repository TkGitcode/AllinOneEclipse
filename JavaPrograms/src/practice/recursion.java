package practice;


class Rec
{
	 String result="";
	 int count=0;
	public  String reverseWord(String str)
	{
		/*
		 * //char inputChar=input.charAt(0); while(input.charAt(count)!=' ') {
		 * System.out.print(input.charAt(count)); result+=input.charAt(count);
		 * //input=input.substring(count+1); count++;
		 * //System.out.println(input.substring(count+1)); //count++;
		 * //reverseWord(input.substring(count));
		 * 
		 * } System.out.println();
		 * 
		 * //input=input.substring(count+1); System.out.println("Count"+ count);
		 * reverseWord(input.substring(count+1));
		 */
		
		if ((null == str) || (str.length() <= 1)) {
			//System.out.println(str);
	        return str;
	    }
		System.out.println(str);
	    return reverseWord(str.substring(1)) + str.charAt(0);
		//return result;
	}
}


public class recursion {
	private static int i = 0;


	public static void main(String[] args) {
		 reverse("Hello Hi Vanakam");

	}
	public static String reverse(String str) {
        int localI = i++;
        if ((null == str) || (str.length()  <= 1)) {
            return str;
        }
        System.out.println("Step " + localI + ": " + str.substring(1) + " / " + str.charAt(0));
        String reversed = reverse(str.substring(1)) + str.charAt(0);

        System.out.println("Step " + localI + " returns: " + reversed);
        return reversed;
    }

}
