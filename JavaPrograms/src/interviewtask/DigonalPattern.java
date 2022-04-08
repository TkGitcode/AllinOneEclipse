package interviewtask;

public class DigonalPattern {

	public static void main(String[] args) {
		String in = "racecar";
		int mid = in.length() / 2;
		int mid1 = mid + 1;
		int mid2 = mid1;
//		for (int i = 0; i < in.length(); i++) {
//			for (int j = 0; j < in.length(); j++) {
//				if (j == mid) {
//					System.out.print(in.charAt(j));
//					mid--;
//				} else {
//					System.out.print(" ");
//				}
//				if (j == mid1 - 1) {
//					if (j != mid2 - 1)
//						System.out.print(in.charAt(j));
//
//				}
//			}
//			mid1++;
//			System.out.println();
//		}
		mid = in.length() / 2;
		mid1 = mid + 1;
		mid2 = mid1;
		for (int i = 0; i < in.length()/2; i++) {
			for (int j = 0; j < in.length(); j++) {
				if (j == mid) {
					System.out.print(in.charAt(j));
					mid--;
				} else {
					System.out.print(" ");
				}
				if (j == mid1 - 1) {
					if (j != mid2 - 1)
						System.out.print(in.charAt(j));

				}
			}
			mid1++;
			System.out.println();
		}
	}

}
