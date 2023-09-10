package practicalModuleTwo;

class MathUtils
{
	private int a,b,c;
	private double x,y,z;
	public int add(int a, int b)
	{
		return a+b;
	}
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public double add(double x, double y)
	{
		return x+y;
	}
	public double add(double x, double y, double z)
	{
		return x+y+z;
	}
}

public class practicalSeven {

	public static void main(String[] args) 
	{
		MathUtils mu = new MathUtils();
		System.out.println(mu.add(10, 20));
		System.out.println(mu.add(10, 20, 30));
		System.out.println(mu.add(15.5, 55.3));
		System.out.println(mu.add(54.23, 86.3, 75.6));
	}

}
