import java.util.Scanner;
public class Add
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=ss.nextInt();
		System.out.println("Enter second number");
		int num2=ss.nextInt();
		int sum=0;
		for(int i=0;i<num2;i++)
			{
			num1++; 
			}
		System.out.println("sum of two number is : " +num1);
		}
	}
