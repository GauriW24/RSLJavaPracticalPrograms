package practicalModuleThree;
import java.util.Scanner;
public class practicalOne {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive integer number: ");
		int positiveNumber = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=positiveNumber; i++)
		{
			if(i%2==0)
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum is: " + sum);
		sc.close();
	}

}
