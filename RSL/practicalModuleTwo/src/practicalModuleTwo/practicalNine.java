package practicalModuleTwo;

class circle
{
	private double radius;
	private static double pi=3.14;
	public static double area(double radius)
	{
		return 2*pi*radius*radius;
	}
}
public class practicalNine 
{
	public static void main(String[] args)
	{
		circle c1 = new circle();
		System.out.println("Area of circle: " + c1.area(2.5));
	}
}
