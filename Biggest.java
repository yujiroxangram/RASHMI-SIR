import java.util.Scanner ;
public class Biggest {
	public static void main(String args[]) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int size = ss.nextInt() ;
		int arr[] = new int[size];
		System.out.println("Enter the elements of array.");
		for(int i = 0 ; i<size ; i++) 	{
			arr[i] = ss.nextInt() ;
			}
        	int smallest = arr[0];
        	int largest = arr[0];
	        for (int i = 1; i < arr.length; i++) {
            		if (arr[i] < smallest) {
                		smallest = arr[i];
            			}
            		if (arr[i] > largest) {
                		largest = arr[i];
            			}
        		}
	        System.out.println("Smallest element: " + smallest);
        	System.out.println("Largest element: " + largest);
    		}
	}
