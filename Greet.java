import java.util.Scanner;
public class Greet
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=ss.nextLine();
		String name1=name.toUpperCase();
		System.out.println("Hello, "+name1+" , nice to meet you!."); 
		}
	}
