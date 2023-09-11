package practicalModuleThree;
import java.util.Scanner;
public class practicalSeven {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = sc.nextLine();
		int vowel=0, consonant=0;
		str.toLowerCase();
		str = str.replaceAll("\\s", "");
		System.out.println(str);
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
			{
				vowel++;
			}
			else
				consonant++;
		}
		System.out.println("Vowels in string is: " + vowel);
		
		System.out.println("consonant in string is: " + consonant);
		
		System.out.println("uppercase string is: " + str.toUpperCase());
	
		//reverse string without reversing each and every character
		
		String str1 = "Hello, I am a graduated student from D. Y. Patil.";
		String []s = str1.split(" ");
		String revStr = "";
		for(int i=s.length-1;i>=0; i--)
		{
			revStr = revStr+s[i]+" ";
		}
		System.out.println(revStr);
	}

}
