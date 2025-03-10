import java.util.Scanner;
 class node
     	{
        int power[]=new int[Polynomial.n];
	int coef;
	node next;
     	}
 class Polynomial
	{
	static int n;
	static int input()
		{
		return (new Scanner(System.in).nextInt());
		}
 static int pow(int x,int a)
	{
	if (a==0)
		return 1;
	int r=1;
	for(int i=1;i<=a;i++)
		r*=x;
	return r;
	}
 public static void main(String args[])
	{
        System.out.println("\n\n\tCalculating POLYNOMIAL Function using Single Linked List.");
        System.out.println("\t==========================\n\n");
	System.out.print("Enter number of variables : ");
	n=input();
	node start;
	node temp=new node();
	start=temp;
	int x[]=new int[n];
        System.out.println("1st enter Coefficient of variable & then enter its Power.");
        System.out.println("It STOPs automatically when all variables power becomes 0");
	int t=1;
	while(true)
		{
		System.out.print("\n\n\tCoefficient of term "+t+" : ");
		temp.coef=input();
		for(int i=0;i<n;i++)
			{
                        System.out.print("\t Power of x "+(i+1)+" : ");
			temp.power[i]=input();
			}
		int sum=0;
		for(int i=0;i<n;i++)
			sum=sum+temp.power[i];
		if(sum<=0)
	                break;
	        System.out.print("\nAny more term?(y / n) : ");
	        char ch=new Scanner(System.in).nextLine().charAt(0);
                if(ch=='n'||ch=='N')
	        	break;
	        temp.next=new node();
	        temp=temp.next;
	        t++;
              	}
	      for(int i=0;i<n;i++)
	       		{
		    	System.out.print("\n Enter value of variable x "+(i+1)+" : ");
		    	x[i]=input();
	       		}
	      temp=start;
	      int sum=0;
	      while(temp!=null)
			{
			int tot=1;
			for(int i=0;i<n;i++)
			tot=tot*pow(x[i],temp.power[i]);
			sum=sum+(temp.coef*tot);
			temp=temp.next;
			}
            System.out.println("\n\nSUM OF POLYNOMIAL FUNCTION : "+sum);
            }
        } 
