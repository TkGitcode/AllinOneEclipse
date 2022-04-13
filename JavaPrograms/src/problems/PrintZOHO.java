package problems;

public class PrintZOHO {

	public static void main(String[] args) {
		String in = "ZOHO";
		for (int k = 0; k < in.length(); k++) {
			if (k == 0) {
				for (int i = 0; i < in.length(); i++) {
					for (int j = 0; j < in.length(); j++) {
						if (i == 0 || i == in.length() - 1) {
							System.out.print(in.charAt(k));
						} else if (i > 0 || i < in.length()) {
							if (in.length() - j == i + 1) {
								System.out.print(in.charAt(k));
							} else {
								System.out.print(" ");
							}
						}
					}
					System.out.println();
				}
			}
			System.out.println();
			if (k == 1) {
				for (int i = 0; i < in.length(); i++) {
					for (int j = 0; j < in.length(); j++) {
						if (i == 0 || i == in.length() - 1) {
							System.out.print(in.charAt(k));
						} else if (i > 0 || i < in.length()) {
							if (in.length() - j == in.length() || j == in.length() - 1) {
								System.out.print(in.charAt(k));
							} else {
								System.out.print(" ");
							}
						}
					}
					System.out.println();
				}
			}
			System.out.println();
			if (k == 2) {
				int mid = in.length() / 2;
				for (int i = 0; i < in.length(); i++) {
					for (int j = 0; j < in.length(); j++) {

						if ((j == 0 || j == in.length() - 1) && i != mid) {
							System.out.print(in.charAt(k));
						}
						if (i == mid) {
							System.out.print(in.charAt(k));
						}

						else {
							System.out.print(" ");
						}

					}
					System.out.println();
				}
			}
			System.out.println();
			if (k == 3) {
				for (int i = 0; i < in.length(); i++) {
					for (int j = 0; j < in.length(); j++) {
						if (i == 0 || i == in.length() - 1) {
							System.out.print(in.charAt(k));
						} else if (i > 0 || i < in.length()) {
							if (in.length() - j == in.length() || j == in.length() - 1) {
								System.out.print(in.charAt(k));
							} else {
								System.out.print(" ");
							}
						}
					}
					System.out.println();
				}
			}
		}
	}

}
