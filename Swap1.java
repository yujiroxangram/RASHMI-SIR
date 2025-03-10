//2nd program
import java.util.Scanner;
public class Swap1
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=ss.nextInt();
		System.out.println("Enter second numer");
		int b=ss.nextInt();
		System.out.println("Before swapping");
		System.out.println(a+"\t"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping");
		System.out.println(a+"\t"+b);
		}
	}
