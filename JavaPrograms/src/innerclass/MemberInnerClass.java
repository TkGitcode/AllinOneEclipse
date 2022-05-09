package innerclass;


public class MemberInnerClass {

	public static void main(String[] args) {
		
		String x="2x2-y+x";
		String y="2x2+y";
		String a[]=x.split("(\\-)");
		String b[]=y.split("(\\+-)");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
	}

}
