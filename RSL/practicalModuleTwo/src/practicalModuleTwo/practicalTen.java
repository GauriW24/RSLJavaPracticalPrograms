package practicalModuleTwo;

class Animal
{
	public void speak()
	{
		System.out.println("Animals can speak in different sounds or ways...");
	}
}
class Dog extends Animal
{
	public void speak()
	{
		System.out.println("Dog barks..");
	}
}

public class practicalTen 
{
	public static void main(String[] args)
	{
		Animal d2 = new Animal();
		d2.speak();
		Dog d1 = new Dog();
		d1.speak();
		Animal a1 = new Dog();
		a1.speak();
	}
}