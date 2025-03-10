import java.util.Scanner ;
public class QuickSort {
    public static void main(String[] args) {
	Scanner ss = new Scanner(System.in)	;
	System.out.println("Enter the size of the array.")	;
	int size = ss.nextInt() ;
	int arr[] = new int[size]		;
	System.out.println("Enter the elements in the array.")	;
	for(int i = 0 ; i<size ; i++)	{
		arr[i] = ss.nextInt() ;
		}		 
    	quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            	System.out.print(num + " ");
        	}
    	}
    
    public static void quickSort(int[] arr, int low, int high) {
        	if (low < high) {
            	int pivotIndex = partition(arr, low, high);
            	quickSort(arr, low, pivotIndex - 1);
            	quickSort(arr, pivotIndex + 1, high);
        	}
    	}
    
    public static int partition(int[] arr, int low, int high) {
        	int pivot = arr[high];
        	int i = low - 1;
        	for (int j = low; j < high; j++) {
            		if (arr[j] < pivot) {
                		i++;
                		int temp = arr[i];
                		arr[i] = arr[j];
                		arr[j] = temp;
            			}
        		}
        	int temp = arr[i + 1];
        	arr[i + 1] = arr[high];
        	arr[high] = temp;
        	return i + 1;
    		}
	}