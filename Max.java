import java.util.*;
class Max
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=0,max=0;
		n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(ar[i] == ar[n+1])
			{
				max = ar[i];
			}
		}		
		System.out.println(max);
	}
}