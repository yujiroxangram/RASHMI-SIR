import java.util.Scanner;
public class GcdLcm
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=ss.nextInt();
		System.out.println("Enter second number");
		int b=ss.nextInt();
		int m=a*b;
		while(a!=b)
			{
			if(a>b)
				{	
				a=a-b;
				}else{
				b=b-a;
				}
			}
		int lcm=m/b;
		System.out.println("GCD = "+b+"\tLCM = "+lcm);
		}
	}
