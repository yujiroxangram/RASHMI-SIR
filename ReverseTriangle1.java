/*
*****
****
***
**
*
*/
import java.util.Scanner;
public class ReverseTriangle1
	{
	public static void main(String args[])
	{
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter number of row")	;
	int row=ss.nextInt();
	int k=0,i=0,j=0;
	for(i=0;i<row;i++)
		{
		for(k=1;k<=i;k++)
			{
			System.out.print(" ");
			}
		for(j=(row-1);j>=i;j--)
			{
			System.out.print("*");
			}
		System.out.println();
		}
	}
}
