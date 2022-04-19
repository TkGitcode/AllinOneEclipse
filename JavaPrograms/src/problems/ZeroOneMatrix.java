package problems;

public class ZeroOneMatrix {
	/*
	 * 1 0 0 0 1 0
	 */
	{
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int a[][] = { { 1, 0 }, { 0, 0 } };
	static int b[][] = new int[a.length][a[0].length];

	public static void ChangeToOne(int i, int j) {

		int colPoint = i;
		int rowPoint = j;
		for (int row = 0; row < b[i].length; row++) {
			b[colPoint][row] = 1;
			System.out.print(b[colPoint][row] + " ");
		}
		for (int col = 0; col < b.length; col++) {
			b[col][rowPoint] = 1;
			System.out.print(b[col][rowPoint] + " ");
		}

	}

	public static void main(String[] args) {
		ZeroOneMatrix zr = new ZeroOneMatrix();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 1) {
					ChangeToOne(i, j);
				}
			}
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}

}
