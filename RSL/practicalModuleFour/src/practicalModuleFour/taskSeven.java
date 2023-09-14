package practicalModuleFour;
import java.util.Scanner;

interface shape
{
	abstract double area();
	abstract double perimeter();
}
class triangle implements shape
{

	double base, height, side1,side2;
	@Override
	public double area() 
	{
		return (base*height)/2;
	}

	@Override
	public double perimeter() 
	{
		return side1 + base + side2;
	}
	
}

class square implements shape
{

	double side;
	@Override
	public double area() 
	{
		return side * side;
	}

	@Override
	public double perimeter() 
	{
		return 4 * side;
	}
	
}

class circle implements shape
{

	double radius;
	final double pi = 3.14;
	@Override
	public double area() 
	{
		return pi * radius * radius;
	}

	@Override
	public double perimeter() 
	{
		return 2* pi *radius;
	}
	
}


public class taskSeven {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		triangle t1 = new triangle();
		System.out.println("Enter value of base: ");
		double base = t1.base = sc.nextDouble();
		System.out.println("Enter value of height: ");
		double height = t1.height = sc.nextDouble();
		double area = t1.area();
		System.out.println("Area of triangle is: " + area);
		
		System.out.println("Enter value of side 1: ");
		double side1 = t1.side1 = sc.nextDouble();
		System.out.println("Enter value of side 2: ");
		double side2 = t1.side2 = sc.nextDouble();

		double peri = t1.perimeter();
		System.out.println("Perimeter of triangle: " + peri);
	
		square s1 = new square();
		System.out.println("Enter value side of square: ");
		double side = s1.side = sc.nextDouble();
		double sArea = s1.area();
		System.out.println("Area of square: " + sArea);
		
		double sPeri = s1.perimeter();
		System.out.println("Perimeter of square: " + sPeri);
		
		circle c1 = new circle();
		System.out.println("Enter radius of circle: ");
		double radius = c1.radius = sc.nextDouble();
		double cArea = c1.area();
		System.out.println("Area of circle: " + cArea);
		double cPeri = c1.perimeter();
		System.out.println("Perimeter of circle: " + cPeri);
	
	}

}
