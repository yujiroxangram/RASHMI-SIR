import java.util.Scanner;
public class BubbleSort {
	public static void main(String args[]) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter size of array.")	;
		int size = ss.nextInt() ;
		int arr[] = new int[size];
		System.out.println("Enter the elements in the array.");
		for(int i = 0 ; i<size; i++) {
			arr[i] = ss.nextInt() ;
			}		
        	bubbleSort(arr);
        	System.out.println("Sorted array:");
        	for (int num : arr) {
            		System.out.print(num + " ");
        		}
    		}
	    static void bubbleSort(int[] arr) {
        	int n = arr.length;
        	for (int i = 0; i < n - 1; i++) {
            		for (int j = 0; j < n - i - 1; j++) {
                		if (arr[j] > arr[j + 1]) {
                    			// swap arr[j] and arr[j+1]
                    			int temp = arr[j];
                    			arr[j] = arr[j + 1];
                    			arr[j + 1] = temp;
                			}
            			}
        		}
    		}
	}
