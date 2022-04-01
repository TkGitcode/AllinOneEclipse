package practice;



abstract class ab 
{
	abstract protected void print();
}
class Main 
{
	Main()
	{
		System.out.println("Main Class Constructor");
	}
	void print()
	{
		System.out.println("Main");
	}
	static void call()
	
	{
		System.out.println("Main Static");
	}
}
class SubClass extends Main
{
	protected void print()
	{
		System.out.println("SubClass");
	}
    static void call()
	{
		System.out.println("Sub Static");
	}
	
}

public class Test1 {

	public static void main(String[] args) {
	SubClass k=new SubClass();
	k.print();
	k.call();

	}

}
