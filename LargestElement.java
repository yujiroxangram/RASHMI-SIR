import java.io.*;
public class LargestElement {
    	public static int findLargest(int[] arr) {
        		int max = arr[0];
        		for (int num : arr) {
            			if (num > max) 
				max = num;
        			}
        		return max;
    		}
	public static void main(String[] args)throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter the size of the array.");
		int size = Integer.parseInt(dis.readLine());
		int arr[] = new int[size];
		System.out.println("Enter array elements which is single digit.");
		for(int i = 0 ; i<size ; i++) {
			arr[i] = Integer.parseInt(dis.readLine());
			}	
        		System.out.println("Largest Element is  : " + findLargest(arr));
    		}
	}
