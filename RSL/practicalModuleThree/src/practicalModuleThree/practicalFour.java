package practicalModuleThree;
import java.util.Scanner;

public class practicalFour {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check palindrome or not: ");
		String str = sc.next();
		String revStr = "";
		str = str.replaceAll("\\s", "");// '\\s' single space in unicode
		
		for(int i=str.length()-1; i>=0; i--)
		{
			revStr = revStr + str.charAt(i);
		}
		
		if(str.toLowerCase().equals(revStr.toLowerCase()))
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
	}

}
