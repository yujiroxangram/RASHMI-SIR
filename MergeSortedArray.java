import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
	public static int[] mergeArrays(int arr1[], int arr2[]) {
        		int rr[] = new int[arr1.length + arr2.length];
        		int i = 0, j = 0, k = 0;
        		while (i < arr1.length && j < arr2.length) {
            			rr[k++] = (arr1[i] < arr2[j]) ? arr1[i++] : arr2[j++];
        			}
        		while (i < arr1.length) 
			rr[k++] = arr1[i++];
        		while (j < arr2.length) 
			rr[k++] = arr2[j++];
        		return rr;
    		}

	public static void main(String[] args) {
        		int x1[] = {1, 3, 5, 7};
        		int x2[] = {2, 4, 6, 8};
        		System.out.println("Merged Array: " + Arrays.toString(mergeArrays(x1, x2)));
    		}
	}
