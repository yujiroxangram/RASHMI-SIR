import java.util.Scanner;
public class CharPresent {
   	public static void main(String args[])
   		{
        	int a[]=new int[26];
        	for(int i=0;i<26;i++)	{
           		a[i]=0;
        	}
        	Scanner s=new Scanner(System.in);
        	System.out.println("enter the string");
        	String st=s.nextLine();
        	String st1=st.toLowerCase();
        	char bt[]=st1.toCharArray();
        	for(int j=0;j<st1.length();j++)	{
           		for(int i=0;i<26;i++) {
          			int k=i+97;
             			if((byte)bt[j]==k) {
                			a[i]++;
             				}
          			}
        		}
        	for(int i=0;i<26;i++) {
            		if(a[i]!=0)
        System.out.println((char)(i+97)+" is present in string for : "+a[i]+" times.");
        	}
        	}
	}