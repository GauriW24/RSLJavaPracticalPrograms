package practicalModuleTwo;

class studentClass
{
	int age;
	String name;
	studentClass()
	{
		age = 0;
		name = null;
	}
	studentClass(String n, int a)
	{
		name = n;
		age = a;
	}
	studentClass(studentClass st)
	{
		name = st.name;
		age = st.age;
	}
}

public class practicalSix {

	public static void main(String[] args) 
	{
		studentClass s1 = new studentClass();
		System.out.println(s1.name+ " " + s1.age);
		
		studentClass s2 = new studentClass("Gauri Wadekar",21);
		System.out.println(s2.name+ " " + s2.age);
		
		studentClass s3 = new studentClass(s2);
		System.out.println(s3.name+ " " + s3.age);
	}

}
