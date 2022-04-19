package interviewtask;

public class IncreaseArraySize {

	public int[] resize(int a[], int size) {
		int[] temp = new int[size + a.length];
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		return temp;
	}

	public static void main(String[] args) {

		
		IncreaseArraySize ic=new IncreaseArraySize();
		int a[] = { 5, 4, 3, 5, 3 };
		System.out.println(a.length);
		a = ic.resize(a,9);
		a[5]=43;
		System.out.println(a.length);

	}

}
