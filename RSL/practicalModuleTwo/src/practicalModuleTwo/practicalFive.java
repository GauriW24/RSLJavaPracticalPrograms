package practicalModuleTwo;
class Student
{
	private String name;
	private int age;
	Student(String n, int a)
	{
		name = n;
		age = a;
	}
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
}
public class practicalFive {

	public static void main(String[] args) 
	{
		Student s1 = new Student("Gauri",21);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}

}
