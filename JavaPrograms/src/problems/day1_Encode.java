package problems;

public class day1_Encode {

	static String check(int i) {
		switch (i) {
		case 0:
			return "A";
		case 1:
			return "B";
		case 2:
			return "C";
		case 3:
			return "D";
		case 4:
			return "E";
		}
		return "";
	}

	public static void main(String[] args) {
		String in = "1100111";
		String result = "";
		int prev = 0, count = 0;
		for (int i = 0; i < in.length(); i++) {
			if (in.charAt(i) == '0') {
				 System.out.println(prev + " " + i);
				String val = check(i - prev);
				result += val;
				prev = i + 1;
				count = 0;
			} else {
				count++;
				if (count >= 4) {
					String val = check(count);
					result += val;
					prev = i + 1;
					count = 0;

				}
			}

		}
		System.out.println(result);

	}

}
