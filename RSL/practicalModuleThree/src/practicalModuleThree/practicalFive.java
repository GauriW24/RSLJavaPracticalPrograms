package practicalModuleThree;
import java.util.Scanner;

public class practicalFive {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive integer to check number is prime or not: ");
		int num = sc.nextInt();

		if(num==0)
		{
			System.out.println("not prime");
		}
		for(int i=2;i<=Math.round(Math.sqrt(num)); i++)
		{
			if(num%i==0)
			{
				System.out.println(num + " not is prime number");
				break;
				
			}
			else
			{
				System.out.println(num + " is prime number");
				break;
			}
		}
	}

}
