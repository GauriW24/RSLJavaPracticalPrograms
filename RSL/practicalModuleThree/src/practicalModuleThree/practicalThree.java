package practicalModuleThree;
import java.util.Scanner;

class factorial
{
	 int fact(int num)
	{
		if(num == 0)
			return 1;
		else
			return num* fact(num-1);
	}
}

public class practicalThree {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial: ");
		int num = sc.nextInt();
		int fact=1;
		factorial fc = new factorial();
		fact = fc.fact(5);
		System.out.println(fact);
		
//		int fact=1;
//		if((num==0))
//		{
//			System.out.println("1");
//			System.exit(0);
//		}
//		for(int i=1; i<=num; i++)
//		{
//			fact = fact * i;
//		}
//		System.out.println("factorial of  " + num + " is: " + fact);
		
	}

}
