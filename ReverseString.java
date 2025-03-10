import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a String.");
        		String str = ss.nextLine();
        		String rev = new StringBuilder(str).reverse().toString();
        		System.out.println("Reversed String for : " + str + " is  : " + rev);
    		}
	}