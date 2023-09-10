package practicalModuleTwo;

class A
{
	A()
	{
		System.out.println("Class A() method");
	}
	public void method()
	{
		System.out.println("class A method");
	}
}
class B extends A
{
	B(){
		super();
	}
	
	public void method()
	{
		System.out.println("class B method");
	}
	public void methodTwo()
	{
		method();
		super.method();
	}
}

public class practicalEleven {

	public static void main(String[] args) 
	{
		A a = new A();
		a.method();
		
		B b = new B();
		b.method();
		b.methodTwo();
		
	}

}
