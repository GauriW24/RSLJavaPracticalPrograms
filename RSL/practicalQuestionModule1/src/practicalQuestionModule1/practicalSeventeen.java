package practicalQuestionModule1;

public class practicalSeventeen {

	public static void main(String[] args) 
	{
		//1. euqals()
		String str1 = "Gauri";
		String str2 = "Gauri";
		String str3 = new String("Gauri");
		String str4 = "Aditya";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1==str4);
		
		//2. equalsIgnoreCase()
		String s1 = "Gauri";
		String s2 = "gauri";
		System.out.println("euqalsIgnoreCase: ");
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println("compare to");
		//check if
		//s1>s2 - return +ve number
		//s1<s2 - return -ve number
		//s1==s2 return 0
		//it will return difference based on unicodes
		System.out.println(s1.compareTo(s2));
	}

}
