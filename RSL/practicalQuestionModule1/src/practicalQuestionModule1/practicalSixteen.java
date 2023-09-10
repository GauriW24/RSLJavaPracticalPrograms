package practicalQuestionModule1;
import java.util.Scanner;
public class practicalSixteen {

	public static void main(String[] args) 
	{
		String str = "Madam";
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter character to check occurance of it in " + "'"+str+"'" + "string: ");
		char ch = sc.next().charAt(0);
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.toLowerCase().charAt(i)==ch || str.toUpperCase().charAt(i)==ch)
				count++;
		}
		System.out.println(ch +" is occured "+ count + " times in a string.");

	}

}
