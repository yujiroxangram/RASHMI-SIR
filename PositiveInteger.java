import java.util.Scanner;
public class PositiveInteger
        {
        public static void main(String args[])
                {
                Scanner ss=new Scanner(System.in);
                System.out.println("Enter a number");
                int num=ss.nextInt();
                for(int i=2;i<num;i++)
                        {
                        if(num%i==0)
                                {
                                System.out.println(i);
                                }
                        }
                }
                }


