package practicalModuleTwo;

public class practicalSixteen {

	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50};
		try
		{
			for(int i=0; i<=5; i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is always executed");
		}
	}

}
