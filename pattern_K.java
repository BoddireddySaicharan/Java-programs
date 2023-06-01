import java.util.Scanner;
class pattern_K
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows m: ");
		int m=sc.nextInt();
		System.out.println("enter the number of columns n: ");
		int n=sc.nextInt();
		for (int i=0;i<m ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(j==0||i==m/2&&j<=n/2||i+j==n-1&&j>=n/2||i==j&&j>=n/2)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}
}
