package problems;


public class FourteGame {

	public static void main(String[] args) {
		int output=10,first=1,second=2,third=3,fourth=4;
		char expression[] = { '+', '-', '*', '/', '(', ')' };
		String result = null;
		int resultInt = 0;
		for (int i = 0; i < expression.length; i++) {

			result = first + "" + expression[i] + "" + second + "" + expression[i] + "" + third + expression[i] + ""
					+ fourth;

			switch (expression[i]) {
			case '+':
				resultInt = first + second + third + fourth;
				break;
			case '-':
				resultInt = first - second - third - fourth;
				break;
			case '*':
				resultInt = first * second * third * fourth;
				break;
			case '/':
				resultInt = first / second / third / fourth;
				break;
			}
			if (resultInt == output) {
				System.out.println("Possible evaluation is " + result);
				break;
			}
		}
	}



}
