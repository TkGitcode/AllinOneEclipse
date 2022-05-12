package com.stream;

@FunctionalInterface
interface login {
	public void customerLogin(int pass);
}

class Security implements login {
	public void customerLogin(int pass) {
		System.out.println("I am From Class");
	}
}

public class LambdaExample {

	public static void main(String[] args) {

		login l = (pass) -> {
			if (pass == 1)
				System.out.println("User Logined SuccessFully");
			else
				System.out.println("Login Failed");
		};

		Security t = new Security();
		l.customerLogin(1);
	}

}
