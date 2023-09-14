package practicalModuleFour;

class person
{
	private String name;
	private int age;
	private String email;
	person(String n, int a, String e)
	{
		name = n;
		age = a;
		email = e;
	}
	person(){
		
	}
	//setters
	public void setAll(String n, int a, String e)
	{
		name = n;
		age = a;
		email = e;
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getEmail()
	{
		return email;
	}
	
	public String toString() {
		return name + " " + age + " " + email;
	}
}

public class taskOne {

	public static void main(String[] args) 
	{
		person p1 = new person("Gauri", 20 , "gauri@gmail.com");
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getEmail());
		
		person p2 = new person();
		p2.setAll("Aditya", 30, "adi@gmail.com");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getEmail());
	
		person p3 = new person("Aastha" , 21, "aastha@gmail.com");
		System.out.println(p3);
	}

}
