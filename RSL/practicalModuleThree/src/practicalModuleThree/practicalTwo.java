package practicalModuleThree;
import java.util.Scanner;

public class practicalTwo {

	public static void main(String[] args) 
	{
		int n1=0, n2=1 , n3 = 0;
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number to find febonacci series: ");
		num = sc.nextInt();
		System.out.print(n1 +" "+ n2);
		for(int i=2; i<=num; i++)
		{
			n3 = n1+n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			
		}		
	}

}
