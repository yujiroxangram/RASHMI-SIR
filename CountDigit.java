import java.util.Scanner;
public class CountDigit
        {
        public static void main(String args[])
                {
                Scanner ss=new Scanner(System.in);
                System.out.println("Enter a number");
                int num=ss.nextInt();
                int r , count=0 ;
                while(num!=0)
                        {
                        r=num%10;
                        count++;
                        num/=10;
                        }
                System.out.println("in the number total number of digits are : "+count) ;
                }
       }
