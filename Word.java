import java.util.*;
public class Word  {
    	public static void main(String args[])	{
              System.out.println("Please enter the word");
              Scanner ss=new Scanner(System.in);
              String s1=ss.next();
              char content[] = s1.toCharArray();
              Arrays.sort(content);
              String sorted = new String(content);
    	      System.out.println(content);
  	      }
	}