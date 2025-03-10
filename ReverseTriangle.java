/*
*****
****
***
**
*
*/
import java.util.Scanner;  
public class ReverseTriangle
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=ss.nextInt();
		int i=0,j=0;
		for(i=0;i<row;i++)
			{
			for(j=(row-1);j>=i;j--)
				{
				System.out.print("*");
				}
			System.out.print("\n");
			}
		}
	}
