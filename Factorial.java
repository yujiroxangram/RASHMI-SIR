import java.util.Scanner;
public class Factorial {
    	public static int factorial(int n) {
        		return (n == 0) ? 1 : n * factorial(n - 1);
    		}
	public static void main(String[] args) {
	Scanner ss = new Scanner(System.in);
	System.out.println("Enter a number");		
        	int num = ss.nextInt();
        	System.out.println("Factorial of  :  " + num + " is " + factorial(num));
    	}
}
