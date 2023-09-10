package practicalModuleTwo;

/*class callByValue
{
	//changes done in called method not affected in calling method
	int data=100;
	void MyMethod(int d)
	{
		d = d+100;
		System.out.println("inside method() data value is: " + d);
	}
}*/

class callByRef
{
	int data = 200;
	void MyMethod(callByRef cr)
	{
		cr.data = cr.data+100;
	}
}
public class practicalFour {

	public static void main(String[] args) 
	{
		//call by value
		//if we call a method by passing a value.
//		callByValue cv = new callByValue();
//		System.out.println(cv.data);
//		cv.MyMethod(10);
//		System.out.println(cv.data);
		
		callByRef cr = new callByRef();
		System.out.println(cr.data);
		cr.MyMethod(cr);
		System.out.println(cr.data);
	}

}
