import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a range.");
		int range = ss.nextInt();
        		int first = 0, second = 1;
        		System.out.print("Fibonacci Series: " + first + " " + second);
            		for (int i = 2; i < range; i++) {
            			int next = first + second;
            			System.out.print(" " + next);
            			first = second;
            			second = next;
        			}
    		}
	}
