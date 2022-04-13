package problems;

public class ValidIPaddress {

	static void CheckipAddress(String ip) {
		for (int i = 0; i < ip.length();i=i+1) {
			for(int j=0;j< 3;j++)
			{
				
			}
			String strIP = ip.substring(i, 3);
			System.out.println(strIP);
			i=i+4;
			// if(ip.substring(i))
		}
	}

	public static void main(String[] args) {
		String ip = "192.200.145.100";
//		int count=0;
//		String[] ipNum=ip.split(".");
//		int n=Integer.parseInt(ipNum[0]);
//		for(int i=0;i<ipNum.length;i++)
//		{
//			 n=Integer.parseInt(ipNum[i]);
//			System.out.println(ipNum[i].length());
//			if(ipNum[i].length() == 3 && n <=255)
//			{
//				count++;
//				continue;
//			}
//			else {
//				break;
//			}
//		}
//		System.out.println(count);
//		if(count == ipNum.length)
//			System.out.println("valid");
//		else {
//			System.out.println("NotValid");
//		}
		CheckipAddress(ip);

	}

}
