package problems;

public class SwapAlpha {
	static String k = "a&r&k%h$$i";
	static int i = 0, j = k.length() - 1;
	static char c[] = k.toCharArray();

	static void swap(int n1, int n2) {
		char temp = c[n1];
		c[n1] = c[n2];
		c[n2] = temp;
	}

	public static void main(String[] args) {

		while (j > i) {
			if (Character.isAlphabetic(c[j]) && Character.isAlphabetic(c[i])) {
				swap(j, i);
				i++;
				j--;
			} else if (Character.isAlphabetic(c[i]) && !(Character.isAlphabetic(c[j]))) {
				j--;
			} else if (!(Character.isAlphabetic(c[i])) && Character.isAlphabetic(c[j])) {
				i++;
			} else {
				j--;
				i++;
			}
		}
		for (int i = 0; i < c.length; i++)
			System.out.print(c[i]);
	}

}
