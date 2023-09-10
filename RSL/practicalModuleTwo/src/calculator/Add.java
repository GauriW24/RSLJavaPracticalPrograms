package calculator;
import java.util.Scanner;

public class Add
{
	int res;
	public void sum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Integer: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Integer: ");
		int b = sc.nextInt();
		
		res = a + b;
		System.out.println("Additon is: " + res);
	}
}



