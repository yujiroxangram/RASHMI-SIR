import java.util.Scanner ;
public class LinearSearch {
	public static int linearSearch(int[] arr, int target) {
        	for (int i = 0; i < arr.length; i++) {
            		if (arr[i] == target) {
                		return i; // Return the index of the target element if found
            			}
        		}
        	return -1; // Return -1 if target element is not found in the array
    		}
	public static void main(String[] args) {
        	Scanner ss = new Scanner(System.in);
		System.out.println("Enter size of array.");
		int size = ss.nextInt() ;
		int aa[] = new int[size];
		System.out.println("Enter array elements.");
		for(int i = 0 ; i<size ; i++) {
			aa[i] = ss.nextInt() ;
			}
		System.out.println("Enter the array element whom u search.");
		int target = ss.nextInt();
        	int result = linearSearch(aa, target);
        	if (result != -1) {
            		System.out.println("Element found at index: " + result);
        		} else {
            		System.out.println("Element not found in the array.");
        		}
    		}
	}