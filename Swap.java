import java.util.Scanner;
//1st program
public class Swap
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=ss.nextInt();
		System.out.println("Enter second number");
		int b=ss.nextInt();
		int temp=0 ;
		System.out.println("Before swapping");
		System.out.println(a+"\t"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println(a+"\t"+b);
		}
	}
