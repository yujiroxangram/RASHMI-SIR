import java.util.HashSet;
import java.util.Scanner;
public class FindDuplicates {
	public static void findDuplicates(int[] arr) {
        		HashSet<Integer> set = new HashSet<>();
        		System.out.print("Duplicate Elements: ");
        		for (int num : arr) {
            			if (!set.add(num)) 
				System.out.print(num + " ");
        			}
    		}

    	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter size of Array.");
		int size = ss.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements.");
		for(int i = 0; i<size; i++) {
			arr[i] = ss.nextInt();
			}
        		findDuplicates(arr);
    		}
	}
