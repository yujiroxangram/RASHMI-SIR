import java.util.Scanner ;
public class SelectionSort {
	public static void selectionSort(int[] arr) {
        	int n = arr.length;
        	for (int i = 0; i < n - 1; i++) {
            	int minIndex = i;
            	for (int j = i + 1; j < n; j++) {
                		if (arr[j] < arr[minIndex]) {
                    		minIndex = j;
                		}
            		}
            	int temp = arr[minIndex];
            	arr[minIndex] = arr[i];
            	arr[i] = temp;
        	}
    	}
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int size = ss.nextInt() ;
		int arr[] = new int[size];
		System.out.println("Enter the elements in the array.");
		for(int i = 0 ; i<size ; i++) {
			arr[i] = ss.nextInt() ;
			}
       		selectionSort(arr);
        	System.out.println("After sorting array elements are : \n");
        	for (int num : arr) {
            		System.out.print(num + " ");
        		}
    		}
	}