package practicalQuestionModule1;

public class practicalEight {

	public static void main(String[] args) 
	{
		byte z =120; // range -128 to 127
		short x = 30000;// range -32768 to 32767
		int a = 10000;// range -2147483648 to 2147483647
		long b = 10000000;//range 2^63 to 2^63-1
		float c = 20.5F;
		double d = 12223.56;
		char ch = 65535;//range'\u0000'(0) to '\uffff'(65535)
		//or
		char ch2 = '\u0000';//space
		boolean bool = true;
		String str = "Gauri Wadekar";// range -128 to 127
	
		System.out.println(z);
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(bool);
		System.out.println(str);
	}

}
