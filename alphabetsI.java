import java.util.Scanner;
class alphabetsI
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
				if (i==0||i==m-1||j==n/2)
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
