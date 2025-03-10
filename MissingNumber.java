import java.io.*;
public class MissingNumber {
    	public static int findMissingNumber(int[] arr, int n) {
        		int a = n * (n + 1) / 2;
        		int b = 0;
        		for (int num : arr) 
			b += num;
        		return a - b;
    		}

    public static void main(String[] args)throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter the size of the array.");
		int size = Integer.parseInt(dis.readLine());
		int arr[] = new int[size];
		System.out.println("Enter array elements.");
		for(int i = 0 ; i<size ; i++) {
			arr[i] = Integer.parseInt(dis.readLine());
			}
    		System.out.println("Missing Number: " + findMissingNumber(arr, (size+1)));
    		}
	}
