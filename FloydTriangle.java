/*
Floyd's triangle
****************
1 
3 
5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21
*/
 
 import java.util.Scanner;
public class FloydTriangle
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=ss.nextInt();
		int number = 1, counter, j;
		System.out.println("Floyd's triangle");
		for(counter = 1;counter<=rows;counter++)
			{
			for(j = 1 ; j <= counter ; j++ )
				{
				System.out.print(number+" ");        
				number++;
				}        
			System.out.println();
			}
		}
	}
