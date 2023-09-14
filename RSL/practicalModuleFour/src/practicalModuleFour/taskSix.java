package practicalModuleFour;

class Person1
{
	int id;
} 
class student1 extends Person1
{
	String Name;
	public void setAll(int i, String n)
	{
		id = i;
		Name = n;
	}
	public String toString()
	{
		return id + " " + Name;
	}
}

public class taskSix {

	public static void main(String[] args) 
	{
		student1 s1 = new student1();
		s1.setAll(101, "Gauri Wadekar");
		System.out.println(s1);
	}

}
