import java.util.Scanner ;
public class Table {
	public static void main(String args[]) {
		Scanner ss = new  Scanner(System.in);
		System.out.println("Enter the number.");
		int num = ss.nextInt() ;
		for(int i = 1 ; i<=10 ; i++) {
			int result = num * i ;
			System.out.println(num  +"  *  " +i+"  =  "+result);
			}
		}
	}
