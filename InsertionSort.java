import java.util.Scanner;
public class InsertionSort {
    public static void insertionSort(int arr[]) {
        	int n = arr.length;
        	for (int i = 1; i < n; ++i) {
            	int key = arr[i];
            	int j = i - 1;
            	/* Move elements of arr[0..i-1], that are
               	greater than key, to one position ahead
               	of their current position */
            	while (j >= 0 && arr[j] > key) {
                	arr[j + 1] = arr[j];
                	j = j - 1;
            		}
            	arr[j + 1] = key;
       		}
    	}
      
    public static void main(String[] args) {
        	Scanner ss = new Scanner(System.in);
		System.out.println("Enter the size of the array.")	;
		int size = ss.nextInt() ;
		int a[] = new int[size]		;
		System.out.println("Enter the array elements.")	;
		for(int i = 0 ; i<size ; i++)	 {
			a[i] = ss.nextInt() ;
			}
        	insertionSort(a);
        	System.out.println("After sorting array elements are : \n");
        	for (int num : a) {
                	System.out.print(num + " ");
        		}
    		}
	}
	