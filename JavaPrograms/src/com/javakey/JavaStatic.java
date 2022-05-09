package com.javakey;


class Demo
{
	static 
	{
		System.out.println("Static Block");
	}
	public Demo()
	{
		System.out.println("Constructor");
	}
}

public class JavaStatic {

	public static void main(String[] args) {
		Demo demo1=new Demo();
		Demo demo2=new Demo();
		

	}

}
