package practicalModuleTwo;

interface Shape  
{
	public double area();
}
class CircleCls implements Shape
{
	final double pi=3.14;
	double radius=2.5;
	@Override
	public double area()
	{
		return pi * radius * radius;
	}
}
class RectCls implements Shape
{
	double length = 10.5 , width = 2.6;
	@Override
	public double area()
	{
		return length * width;
	}
}

public class practicalThirteen {

	public static void main(String[] args)
	{
		CircleCls c1 = new CircleCls();
		System.out.println("Area of circle: " + c1.area());
	
		RectCls rc = new RectCls();
		System.out.println("Area of rectangle: " + rc.area());
	}

}
