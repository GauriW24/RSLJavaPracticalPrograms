package practicalModuleFour;
class Animal
{
	String animalName;
	int age;
	Animal(String an, int a)
	{
		animalName = an;
		age = a;
	}
	public void speak()
	{
		System.out.println("animal speak in their own way...");
	}
	public String toString()
	{
		return animalName + " " + age;
	}
}
class Mammal extends Animal
{
	Mammal(String an, int a) {
		super(an, a);
	}

	public void speak()
	{
		System.out.println("mammal speak in their own way...");
	}
}
class bird extends Animal
{
	bird(String an, int a) {
		super(an, a);
	}

	public void speak()
	{
		System.out.println("birds make chirping sound...");
	}
}
public class taskNine {

	public static void main(String[] args)
	{
		Animal animal[] = new Animal[3];
		animal[0] = new Mammal("Lion",10);
		animal[1] = new bird("sparrow",3);
		animal[2] = new Mammal("tiger",5);
		for(Animal ani: animal)
		{
			System.out.println(ani);
		}
		
	}

}
