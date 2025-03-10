/*Display the following series
1
1   2
1   2   3
1   2   3	4
*/
import java.util.Scanner;
public class triangle1
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=ss.nextInt();
	
		for(int i=0;i<rows;i++)
			{
			int x=1;
			for(int j=0;j<=i;j++)
				{
				System.out.print(" "+x+" ");
				x++;
				}
			System.out.println();
			}
		}
	}                                         
