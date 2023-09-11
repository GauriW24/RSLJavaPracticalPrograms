package practicalModuleThree;
import java.util.Scanner;
public class practicalTen {

	@SuppressWarnings("null")
	public static void main(String[] args) 
	{
		double sci, maths, english;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many subjects do you have? ");
		int no = sc.nextInt();
		
		double marks[] = new double[no];
		double sum=0, avg=0;
		for(int i=0; i<no; i++)
		{
			System.out.println("enter " + (i+1) + " subject marks: ");
			marks[i] = sc.nextInt();
			sum = sum + marks[i];
			
		}
		avg = sum/no;
		
		System.out.println("Average grade of student is: " + avg);
	}

}
