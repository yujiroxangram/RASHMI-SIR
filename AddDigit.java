import java.util.Scanner;
public class AddDigit
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=ss.nextInt(); 
		int i=0, temp=0,sum=0;
		while(num>0)
			{
			temp=num%10;  
			if((i==0) || (i==3))
				{
				sum=sum+temp; 
				}
			num=num/10; 
			i++; 
			}
		System.out.println("sum= "+sum);
		}
	} 
