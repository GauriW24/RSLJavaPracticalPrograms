package practicalModuleFour;
import java.util.*;
class product
{
	int productId;
	String productName;
	double price;
	product(int pi, String pn, double p)
	{
		productId = pi;
		productName = pn;
		price = p;
	}
	public int getPId()
	{
		return productId;
	}
	public String getProductName()
	{
		return productName;
	}
	public double getPrice()
	{
		return price;
	}
}
class cart
{
	static ArrayList<product> items;
	cart()
	{
		items = new ArrayList<>();
	}
	public void addProduct(product prod)
	{
		items.add(prod);
	}
	public static double calculateTotal()
	{
		double total=0;
		for(product p: items)
		{
			total+= p.getPrice();
		}
		return total;
	}
	public void checkout()
	{
		System.out.println("checkout completed.");
	}
}

class customer extends cart
{

	String customerName;
	int id;
	cart cart1;
	public customer(String n, int i)
	{
		customerName = n;
		id = i;
		cart1 = new cart();
	}
	public void addToCart(product prod)
	{
		cart1.addProduct(prod);
	}
	public void checkout()
	{
		double total = cart.calculateTotal();
		System.out.println("Checkout successful");
		System.out.println("your bill amount is: " + total);

		System.out.println("Customer Name: " + customerName);
		System.out.println("customer id: " + id);
	}
	
}
public class taskTen {
    public static void main(String[] args) {
        // Create some products
    	product product1 = new product(1101, "Laptop", 30000);
    	product product2 = new product(2563, "Mouse", 500.0);
        product product3 = new product(3446, "Headphones", 1000);

        // Create a customer
        customer customer = new customer("Gauri Wadekar",1100);

        // Add products to the customer's cart
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.addToCart(product3);

        System.out.println("Product list: ");
        System.out.println(product1.getPId() +"  "+product1.getProductName() + " : " + product1.getPrice());
        System.out.println(product2.getPId() +"  "+product2.getProductName() + " : " + product2.getPrice());
        System.out.println(product3.getPId() +"  "+product3.getProductName() + " : " + product3.getPrice());
        // Checkout
        customer.checkout();
    }
}

