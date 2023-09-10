package calculator;

import java.util.Scanner;

public class Sub 
{
	int res;
	public void sub()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Integer: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Integer: ");
		int b = sc.nextInt();
		
		res = a - b;
		System.out.println("Subtraction is: " + res);

	}
}