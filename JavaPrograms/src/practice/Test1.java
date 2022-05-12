package practice;


interface ifc
{
   default void print()
   {
	   System.out.println("I am from default Interface");
   }
   static void imStatic()
   {
	   System.out.println("\"\"\"/-");
   }
}
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
class SubClass extends ab implements ifc
{
	public void print()
	{
		System.out.println("I am From SubClass");
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
	ifc.imStatic();
	//k.call();

	}

}
