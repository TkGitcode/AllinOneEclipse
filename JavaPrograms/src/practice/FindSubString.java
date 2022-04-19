package practice;

public class FindSubString {

	public static void main(String[] args) {
		String a[] = { "flower", "flow", "flodjfj" };

		String firstString = a[0];
		for (int i = 1; i < a.length; i++) {
			String currentStrig = a[i];
			int j = 0;
			while ((j < firstString.length() && j < currentStrig.length())
					&& firstString.charAt(j) == currentStrig.charAt(j)) {

				j++;
			}
			if (j == 0) {
				System.out.println("");
				return;
			}
			firstString = currentStrig.substring(0, j);
		}
		System.out.println(firstString);

	}

}
