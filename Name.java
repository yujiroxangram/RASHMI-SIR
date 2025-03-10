import java.util.Scanner ;
public class Name {
	public static void main(String args[]) {
        	Scanner ss = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = ss.nextLine() ;
        	String parts[] = name.split(" ");
        	StringBuilder result = new StringBuilder();
		int size = parts.length;
		String last = parts[size-1];
		for (int i = 0 ; i<parts.length-1 ; i++) {
            		result.append(parts[i].charAt(0)).append(".");
        		}
		result.append(last);
		System.out.println("Nme is : "+result.toString());
    		}
	}