package practicalModuleThree;

public class practicalNine {

	public static void main(String[] args)
	{
		int a[][] = {{1,2,3},{1,2,3},{1,2,3}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int c[][] = new int[3][3];
		
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		
		//addition
		/*for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}*/
		//subtraction
		/*for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				c[i][j] =b[i][j] - a[i][j];
			}
		}*/	
		
		//matrix multiplication
		/*for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				c[i][j] = 0;
				for(int k=0; k<c.length; k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}*/
		
		//transposing matrix
		int row = a.length;
		int cols = a[0].length;
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<cols; j++)
			{
				c[i][j] = a[j][i];
			}
		}
		
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c.length; j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}

}
