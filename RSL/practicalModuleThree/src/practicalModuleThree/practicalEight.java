package practicalModuleThree;
import java.math.*;
import java.util.Random;
import java.util.Scanner;
public class practicalEight {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("**Welcome to number guessing game..**");
		
		Random rn = new Random();
		int number = rn.nextInt(100);
		boolean answer = false;
	
		while(!answer)
		{
			System.out.println("Enter a integer number between(1 to 100): ");
			int userNumber = sc.nextInt();
			
			if(userNumber > number)
			{
				System.out.println("Too high");
			}
			else if(userNumber < number)
			{
				System.out.println("Too low");
			}
			else 
				
			{
				System.out.println("congratulations...you win..!!");
				answer = true;
			}
		}
		System.exit(0);
		
	}

}
