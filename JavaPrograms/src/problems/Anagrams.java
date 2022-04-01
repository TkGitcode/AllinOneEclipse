package problems;

public class Anagrams {

	static boolean isAnagram(String n, String n1) {
		n = n.toLowerCase();
		n1 = n1.toLowerCase();
		int flag = 0;
		if (n.length() != n1.length())
			return false;
		else {
			for (int i = 0; i < n.length(); i++) {
				for (int j = 0; j < n1.length(); j++) {
					if (n.charAt(i) == n1.charAt(j)) {
						flag = 1;
						break;
					}
				}
				if (flag == 0)
					return false;
				flag = 0;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		String n = "Sri";
		String n1 = "ris";
		System.out.println(isAnagram(n, n1));

	}

}
