package practicalModuleFour;
import java.util.*;

class Circle1
{
	private final double pi = 3.14;
	public double Area(double r)
	{
		return pi * r * r;
	}
	public double parameter(double r)
	{
		return 2*pi*r;
	}
}
class Rectangle
{
	public double Area(double l, double w)
	{
		return l*w;
	}
	public double parameter(double l, double w)
	{
		return 2*(l+w);
	}
}

public class taskThree {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		double radius = sc.nextDouble();
		Circle1 c1 = new Circle1();
		double area = c1.Area(radius);
		double para = c1.parameter(radius);
		System.out.println("Area of circle is: "+ area);
		System.out.println("Parameter of circle is: "+ para);
	
		Rectangle r1 = new Rectangle();
		System.out.println("Enter Length of rectangle: ");
		double length = sc.nextDouble();
		System.out.println("Enter width of rectangle: ");
		double width = sc.nextDouble();
		double rectArea = r1.Area(length, width);
		System.out.println("Area of rectangle is: " + rectArea);
		double rectPara = r1.parameter(length, width);
		System.out.println("parameter of rectangle is: " + rectPara);
	}

}
