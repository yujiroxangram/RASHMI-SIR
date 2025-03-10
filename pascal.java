/* 
           1
         1     1
       1    2    1
   1     3      3    1
*/
import java.util.Scanner;
public class pascal
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=ss.nextInt();
		int a=1,p,q=0,b;
		for(q=0;q<row;q++)
			{
			for(p=30-3*q;p>0;p--)
				System.out.print(" ");
			for(b=0;b<=q;b++)
				{
				if(b==0 || q==0)
					{
					a=1;
					}else{
					a=(a*(q-b+1)/b);
					}
				System.out.print("     "+a);
				}
			System.out.println();
			}
		}
	}

