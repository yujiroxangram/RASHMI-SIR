import java.util.Scanner;
public class SecondLargest {
	public static void main(String[] args) {
        	Scanner ss = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int size = ss.nextInt() ;
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array.");
		for(int i = 0 ; i<size ; i++) {
			arr[i] = ss.nextInt() ;
			}
        	int largest = Integer.MIN_VALUE;
        	int secondLargest = Integer.MIN_VALUE;
	        for (int number : arr) {
            		if (number > largest) {
                		secondLargest = largest;
                		largest = number;
            		} else if (number > secondLargest && number != largest) {
                		secondLargest = number;
            			}
        		}
	        System.out.println("Second largest number is: " + secondLargest);
    		}
	}
