import java.util.Scanner;
public class ConvertNumberToWord {
	private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        private static final String[] thousands = {"", "thousand", "million", "billion", "trillion"};
	public static String numberToWords(int num) {
        	if (num == 0) 
			return "zero";
                String words = "";
        	int i = 0;
                while (num > 0) {
            		if (num % 1000 != 0) {
                		words = helper(num % 1000) + thousands[i] + " " + words;
            			}
            		num /= 1000;
            		i++;
        		}
        	return words.trim();
    		}
	private static String helper(int num) {
        	if (num == 0) {
            		return "";
        	} else if (num < 10) {
            		return ones[num] + " ";
        	} else if (num < 20) {
            		return teens[num - 10] + " ";
        	} else if (num < 100) {
            		return tens[num / 10] + " " + helper(num % 10);
        	} else {
            		return ones[num / 100] + " hundred " + helper(num % 100);
        		}
    		}
	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter a number: ");
        	int number = scanner.nextInt();
        	System.out.println("Number in words: " + numberToWords(number));
    		}
	}