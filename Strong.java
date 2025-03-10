import java.util.Scanner;
public class Strong
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=ss.nextInt();
		int j=num,temp=0,total=1,gt=0;
		while(num>0)
			{
			total=1;
			temp=num%10;
			for(int i=1;i<=temp;i++)
				total=total*i;
			gt=gt+total;
			num=num/10;
			}
		if(gt==j)
			System.out.println(j+" is a strong number");
		else
			System.out.println(j+" is not a strong number");
		}
	}
