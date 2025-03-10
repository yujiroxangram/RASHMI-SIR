import java.util.Arrays;
import java.util.Scanner;
public class SortWord {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a String");
		String line = ss.nextLine();
        	String words[] = line.split(" ");
        	Arrays.sort(words);
        	for (String word : words) {
            		System.out.println(word);
        		}
    		}
	}