package practicalQuestionModule1;

public class practicalNine {

	public static void main(String[] args) 
	{
		//1. Arithmatic operator: +, -, *, /, %
		System.out.println("Arithmatic operator");
		int a=20, b=10;
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int modulo = a%b;
		System.out.println("+: " + add);
		System.out.println("-: " + sub);
		System.out.println("*: " + mul);
		System.out.println("/: " + div);
		System.out.println("%: " + modulo);
		
		//2.Assignment operator: =
		System.out.println("\nAssignment operator");
		int age = 20;
		System.out.println("assigned age is: " + age);

		//3. Relational operator: >, <, >=, <=, !=, == 
		System.out.println("\nRelational operator");
		int x=35, y=88;
		boolean result1 = x>y;
		boolean result2 = x<y;
		boolean result3 = x>=y;
		boolean result4 = x<=y;
		boolean result5 = x==y;
		boolean result6 = x!=y;
		System.out.println("35>88: " + result1);
		System.out.println("35<88: " + result2);
		System.out.println("35>=88: " + result3);
		System.out.println("35<=88: " + result4);
		System.out.println("35==88: " + result5);
		System.out.println("35!=88: " + result6);
		
		//4. Logical operator: &&, ||, !
		System.out.println("\nLogical operator");
		int p=20, q=30;
		boolean answer = p<q && p!=q;
		System.out.println(answer);
		
		boolean answer1 = p<q && p==q;
		System.out.println(answer1);
		
		boolean answer3 = p<q || p!=q;
		System.out.println(answer3);
		
		boolean answer4 = p>q && p==q;
		System.out.println(answer4);

		boolean answer5 = !(p>q);
		System.out.println(answer5);
	}

}
