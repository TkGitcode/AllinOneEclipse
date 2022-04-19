package problems;

public class ValidParanthesis {

	public static boolean ValidParathesis(String in) {
		int len = in.length();
		int oldlen=in.length();
		while (len-- > 0) {
			
			in = in.replace("()", "").replace("{}", "").replace("[]", "");
			len--;
			System.out.println(in);
		}
		return in.length()!=0;
	}

	public static void main(String[] args) {
		String in = "[()]{}{()]()}";
		System.out.println(!(ValidParathesis(in)));

	}

}
