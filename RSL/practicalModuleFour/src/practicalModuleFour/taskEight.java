package practicalModuleFour;

class Employee
{
	int id;
	String name;
	double salary;
	Employee(int i, String n, double sal)
	{
		id = i;
		name = n;
		salary = sal;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double calculateSal()
	{
		return salary;
	}
}
class Manager extends Employee
{
	double bonus;
	Manager(int i, String n, double sal, double b) {
		super(i, n, sal);
		bonus = b;
	}
	public double calculateSal()
	{
		return super.calculateSal() + bonus;
	}
	
}
class Executive extends Manager
{
	double benifits;
	Executive(int i, String n, double sal, double b, double be) {
		super(i, n, sal, b);
		benifits = be;
	}
	public double calculateSal()
	{
		return super.calculateSal() + benifits;
	}

}


public class taskEight {

	public static void main(String[] args) 
	{
		Employee emp = new Employee(101,"Gauri Wadekar",30000);
		System.out.println("Employee name: " + emp.getName()+ "\n" +"Employee base salary is: " + emp.calculateSal());
		
		Manager m1 = new Manager(101,"Gauri Wadekar",30000, 10000);
		System.out.println("salary with bonus: " + m1.calculateSal());
		
		Executive e1 = new Executive(101,"Gauri Wadekar",30000, 10000,5000);
		System.out.println("Salary with benifits: " + e1.calculateSal());
		
	}

}
