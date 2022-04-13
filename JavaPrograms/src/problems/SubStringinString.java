package problems;

public class SubStringinString {

	static int PosOfSubstring(String mainString, String subString) {
		int flag = 0;
		int i = 0;
		int j = 0;
		int count = 0;
		while (i < mainString.length()) {
			while (j < subString.length()) {
				System.out.println(mainString.charAt(i) + "  " + subString.charAt(j));
				if (mainString.charAt(i) == subString.charAt(j)) {
					i++;
					j++;
					count++;
					if (count == subString.length()) {
						flag = 1;
						return i-subString.length();
					}
				} else {
					i++;
					j = 0;
					count = 0;
				}
			}
			if (flag == 1) {
				return j;
			} else {
				return -1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		String mainString = "test124123123";
		String subString = "124";

		System.out.println(PosOfSubstring(mainString, subString));

	}

}
