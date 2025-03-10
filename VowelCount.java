import java.util.Scanner;
public class VowelCount {
	public static void main(String[] args) {
        	Scanner ss = new Scanner(System.in);
		System.out.println("Enter a String.")	;
		String str = ss.nextLine() ;
        	int vowels = 0, spaces = 0, numbers = 0, specials = 0;
	        for (char c : str.toCharArray()) {
            	if (Character.isLetter(c)) {
                // Check for vowels
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    	vowels++;
                	}
            	} else if (Character.isDigit(c)) {
                // Check for numbers
                	numbers++;
            	} else if (Character.isWhitespace(c)) {
                // Check for spaces
                	spaces++;
            	} else {
                // Check for special characters
                	specials++;
            		}
        	}
	System.out.println("Vowels: " + vowels);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special characters: " + specials);
    	}
	}