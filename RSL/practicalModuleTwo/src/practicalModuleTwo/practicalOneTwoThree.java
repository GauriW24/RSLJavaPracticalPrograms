package practicalModuleTwo;

class Car
{
	private String CarName;
	private double price;
	private	String color;
	public void setAll(String cn, double p, String c)
	{
		CarName = cn;
		price = p;
		color = c;
	}
	public String getCarName()
	{
		return CarName;
	}
	public String getColor()
	{
		return color;
	}
	public double getPrice()
	{
		return price;
	}
}
public class practicalOneTwoThree {

	public static void main(String[] args) 
	{
		Car c1 =  new Car();
		c1.setAll("Ertiga",10000000, "Grey");
		System.out.println("Car name: " + c1.getCarName());
		System.out.println("Color: " + c1.getColor());
		System.out.println("Price: "+ c1.getPrice());
		
	}

}
