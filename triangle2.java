/*
5
4   5
3   4   5
2   3   4	5
1   2   3    4   5
*/
import java.util.Scanner;
public class triangle2
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=ss.nextInt();
		int x=rows,y=rows;
		for(int i=0;i<rows;i++)
			{
			for(int j=0;j<=i;j++)
				{
				System.out.print(" "+y+" ");
				y++;
				}
			x--;
			y=x;
			System.out.println();
			}
		}
	}                                     
