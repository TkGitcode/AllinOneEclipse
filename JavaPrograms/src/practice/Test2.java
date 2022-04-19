
package practice;

import java.util.Scanner;

class sw {
	String finstr;

	String one(int n) {
		switch (n) {
		case 0:
			finstr = "";
			break;
		case 1:
			finstr = "One";
			break;
		case 2:
			finstr = "Two";
			break;
		case 3:
			finstr = "Three";
			break;
		case 4:
			finstr = "Four";
			break;
		case 5:
			finstr = "Five";
			break;
		case 6:
			finstr = "Six";
			break;
		case 7:
			finstr = "Seven";
			break;
		case 8:
			finstr = "Eight";
			break;
		case 9:
			finstr = "Nine";
			break;
		}
		return finstr;
	}

	String tonty(int n1) {
		switch (n1) {
		case 2:
			finstr = "Twinty";
			break;
		case 3:
			finstr = "Thirty";
			break;
		case 4:
			finstr = "Fourty";
			break;
		case 5:
			finstr = "Fifty";
			break;
		case 6:
			finstr = "Sixty";
			break;
		case 7:
			finstr = "seventy";
			break;
		case 8:
			finstr = "Eighty";
			break;
		case 9:
			finstr = "Ninthy";
			break;
		}
		return finstr;
	}

	String thud(int n2) {
		n2 = 100;
		switch (n2) {
		case 100:
			finstr = "Thousand";
			break;
		}
		return finstr;
	}

	String hund(int n3) {
		n3 = 100;
		switch (n3) {
		case 100:
			finstr = "Hundred";
			break;
		}
		return finstr;
	}

}

class Test2 {
	public static void main(String... args) {
		sw s = new sw();
		int[] a = new int[100];
		String n;
		String ll = "";
		int nn = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextLine();

		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9') {
				char k = n.charAt(i);
				int n1 = Character.getNumericValue(k);
				a[nn++] = n1;
			}
		}
		if (nn >= 3) {
			int i = 0;
			if (nn == 4) {
				if (a[i] != 0) {
					ll = s.one(a[i]);
					System.out.print(ll);
					ll = s.thud(a[i]);
					System.out.print(ll);
				}
			}
			if (nn == 3) {
				i = -1;

			}
			ll = s.one(a[i + 1]);
			System.out.print(ll);
			if (a[i + 1] != 0) {
				ll = s.hund(a[i + 1]);
			}
			System.out.print(ll);
			ll = s.tonty(a[i + 2]);
			System.out.print(ll);
			ll = s.one(a[i + 3]);
			System.out.print(ll);
		} else if (nn == 2) {
			int i = 0;
			ll = s.tonty(a[i]);
			System.out.print(ll);
			ll = s.one(a[i + 1]);
			System.out.print(ll);
		} else {
			int i = 0;
			ll = s.one(a[i]);
			System.out.print(ll);
		}
	}

}
// StringBuffer Sb=new StringBuffer();
//    for(int i=0;i<n.length();i++)
//    {
//        sb.append(n.charAt(i));
//    }
//    String ss=sb.toString();
//    for(int j=0,i=0;i<n.length;i++)
//    {

//     int l=Integer.parseInt(n.charAt(i));
//     l=a[j++];
//    }
//    for(int i=0;i<n.length();i++)
//    {
//        System.out.println(a[i]);
//    }
