package problems;

public class CamelCase {

	public static void main(String[] args) {

       String in="hiIamHere";
       int count=0;
       for(int i=0;i<in.length();i++)
       {
    	   int val=in.charAt(i);
    	   if(val>=65 && val<=90) 
    	   {
    		   count++;
    	   }
       }
       System.out.println(count+1);

	}

}
