import java.util.Scanner;
public class Tribonacci
	{
	public static void main(String[] args)
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=ss.nextInt();
		int i=0,j=1,k=1,l=0;
		System.out.print(i+" "+j+" "+k+" ");
		for(int m=3;m<range;m++)
			{
			l=i+j+k;
			System.out.print(l+" ");
			i=j;
			j=k;
			k=l;
			}
		}
	}
