import java.util.Scanner;
public class PrimeCheck {
	public static boolean isPrime(int num) {
        		if (num <= 1) 
			return false;
        		for (int i = 2; i <= Math.sqrt(num); i++) {
            			if (num % i == 0) return false;
        			}
        		return true;
    		}
    
    	public static void main(String[] args) {
        		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = ss.nextInt();
        		System.out.println(num + " is prime  : " + isPrime(num));
    		}
	}
