import java.util.Scanner;
public class PalindromeCheck {
    	public static boolean isPalindrome(String str) {
        	int left = 0, right = str.length() - 1;
        	while (left < right) {
            		if (str.charAt(left) != str.charAt(right)) 
			return false;
            		left++;
            		right--;
        		}
        	return true;
    	}
    	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a String.");
		String str = ss.nextLine();
        		System.out.println(str+"  is Palindrome : " + isPalindrome(str));
    		}
	}
