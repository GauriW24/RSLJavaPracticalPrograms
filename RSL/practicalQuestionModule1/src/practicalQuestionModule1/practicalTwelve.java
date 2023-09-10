package practicalQuestionModule1;

public class practicalTwelve {

	public static void main(String[] args) 
	{
		for(int i=0; i<10; i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("using while");
		int j=0;
		while(j<10)
		{
			if(j==8)
				break;
			System.out.println(j);
			j++;
		}
	}

}
