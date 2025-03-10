import java.util.Scanner;
public class PrimeCount
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter a range");
		int range=ss.nextInt();
		int flag=0,count=0;
		for(int num=1;num<=range;num++)
			{
			flag=0;
			for(int i=1;i<=num;i++)
				{
				if(num%i==0)
					{
					flag++;
					}
				}
			if(flag==2)
				{
				count++;
				}
			}
	System.out.println("Total no of prime numbers present within : "+range+" is : "+count);
		}
	}
