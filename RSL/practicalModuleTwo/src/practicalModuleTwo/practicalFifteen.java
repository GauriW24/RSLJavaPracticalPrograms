package practicalModuleTwo;

class A1
{
	protected int x = 10;
//	private int x = 10;
	A1()
	{
		System.out.println("Constructor");
	}
	void method()
	{
		System.out.println("default method");
	}
}

public class practicalFifteen {

	public static void main(String[] args)
	{
		A1 a = new A1();
		a.method();
		
		System.out.println(a.x);
	}

}
