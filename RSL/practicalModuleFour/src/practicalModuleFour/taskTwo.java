package practicalModuleFour;
import java.util.*;
class bankAccount
{
	private long accountNumber;
	private double balance;
	private String accountHolderName;
	
	public void setAll(long accno, double bal, String name)
	{
		accountNumber = accno;
		balance = bal;
		accountHolderName = name;
	}
	public long getAccno()
	{
		return accountNumber;
	}
	public double getBal()
	{
		return balance;
	}
	public String getAccHolderName()
	{
		return accountHolderName;
	}
	//deposit
	public double deposit(double bal, double amt)
	{
		bal = bal + amt;
		return bal;
	}
	
	public double withdraw(double bal, double amt)
	{
		bal = bal - amt;
		return bal;
	}
	
	
}

public class taskTwo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		bankAccount ba = new bankAccount();
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your Account Number: ");
		long accnumber = sc.nextLong();
		System.out.println("Enter your Balance: ");
		double balance = sc.nextLong();
		ba.setAll(accnumber, balance, name);
		
		System.out.println("\nUser Information \nName: " + name + "\nAccount Number: " + accnumber + "\nBalance: " + balance +"\n");
		
		int choice;
		System.out.println("Enter your choice: (1/2/3)\n1.Deposit \n2.Withdraw \n3.Exit");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter amount to deposit: ");
				double amount = sc.nextDouble();
				double depositCash = ba.deposit(balance, amount);
				System.out.println(name + " you deposit " + amount + " in your account "+ " \nyour balance is: " + depositCash);
			
			case 2:
				System.out.println("Enter amount to withdraw: ");
				double amount1 = sc.nextDouble();
				double withdrawCash = ba.withdraw(balance, amount1);
				System.out.println(name + " you withdraw " + amount1 + " from your account "+ " \nyour balance is: " + withdrawCash);
			
			case 3:
				System.exit(0);
		}
		
	}

}
