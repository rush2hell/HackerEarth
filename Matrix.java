import java.util.*;
class Matrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		static int n;
		int d1=0;
		n = sc.nextInt();
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		//1st diagonal
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i == j)
				{
					d1 = a[i][j] + d1;	
				}
			}
		}
		System.out.println(d1);
		//2nd diagonal
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>=0;j--)
			{
				System.out.println(a[i][j]);
			}
		}
	}
}	