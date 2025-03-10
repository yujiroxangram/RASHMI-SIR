import java.util.Scanner;
public class Armstrong
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=ss.nextInt();
		int temp=0,total=0,i=num;
		while(num>0)
			{
			temp=num%10;
			total+=(temp*temp*temp);
			num=num/10;  
			}
		if(i==total)
			{
			System.out.println(i+" is an armstrong number");
			}else{
		System.out.println(i+" is not an Armstrong number");
			}
		}
	}
