/*
*
**
***
****
*/
import java.util.Scanner; 
public class Triangle3
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=ss.nextInt();
		for(int i=0;i<=rows;i++)
			{
			for(int j=0;j<i;j++)
				{
				System.out.print(" * ");
				}
			System.out.print("\n");     
			}
		}
	}
