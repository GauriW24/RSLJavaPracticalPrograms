package practicalQuestionModule1;

public class practicalFourteen {

	public static void main(String[] args) 
	{
		int arr[][] = new int[6][11];
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=10; j++)
			{
				arr[i][j] = i * j;
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

}
