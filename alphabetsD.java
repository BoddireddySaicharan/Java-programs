import java.util.Scanner;
class alphabetsD
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int m=sc.nextInt();
		System.out.println("enter the no of columns");
		int n=sc.nextInt();
		for (int i=0;i<m;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (j==0||(i==0&&j!=n-1)||(i==m-1&&j!=n-1)||(j==n-1&&i!=0&&i!=n-1))
				{
					System.out.print("|");
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
