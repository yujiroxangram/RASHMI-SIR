/*
      *
    ***
  *****
*******
*/
import java.util.Scanner;
public class Triangle4
	{
	public static void main(String[] args)
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=ss.nextInt();
		int i=0,j=0,k=0,star=1;
		for(i=0;i<row;i++)
			{
			for(j=1;j<(row-i);j++)
				{
				System.out.print(" ");
				}
			for(k=star;k>=1;k--)
				{
				System.out.print("*");
				}
			star=star+2;
			System.out.println();
			}
		}
	}
