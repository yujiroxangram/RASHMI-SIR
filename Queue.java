import java.util.*;
class node
	{
	        	int data;
		node next;
	}
public class Queue
	{
	static node last;
	static node first;
	public static void main(String args[])
	      {
	      System.out.println("\n\n\t\t~~~~~~~~~~ WELCOME~~~~~~~~~~\n");
	      System.out.println("With the help of this program we can create and update one Queue.\n");
	      System.out.println("This program coded in JAVA using java \"reference concept\".\n"); 
              System.out.println("Thanks you a lot for trying this.....\n\n\n");
	      while(true)
	      	{ 	
		menu();
		}
	      }
  	static void menu()
   		{
		Scanner read=new Scanner(System.in);
		System.out.println("\t\t\t\tQUEUE MENU");
		System.out.println("\t\t\t\t==========");
		System.out.println("\n\n\t\t\t1. Create\t2. Traverse\n\t\t\t3. Insert\t4. Replace\n\t\t\t5. Delete\t6. Count elements\n\t\t\t7. EXIT");
		System.out.print("\n\nEnter your choice : ");
		int choice=read.nextInt();
		switch(choice)
	  		{
			case 1:
				create();
				break;
			case 2:
				traverse();
				break;
			case 3:
				insert();
                                break;
			case 4:
				replace();
				break;
			case 5:
                                delete1();
                                break;
			case 6:
                                System.out.println("\n\n\tTotal " +count1()+" elements present\n\n");
			break;
                        case 7:
                                System.exit(0);
                        default:
                                System.out.println("\n\n\t\tInvalid Input !!!\n");
                        }
                }
static void create()
	{
		Scanner read=new Scanner(System.in);
                System.out.print("\n\nEnter -1 to stop entering data");
		node temp=new node();
		int i=2;
		first=last=temp;
                System.out.print("\nEnter data no. 1 : ");
		temp.data=read.nextInt();
		if(temp.data!=-1)
		{
		     while(true)
			{
				node temp1=new node();
                                System.out.print("\nEnter data no. "+i+" : ");
				temp1.data=read.nextInt();
				if(temp1.data == -1)
					break;
				temp.next=temp1;
				temp=temp1;		
				last=temp;
				i++;
		      }
	      }
	else
	  {
		first=last=null;
	  }
	
     }
       static void traverse()
	{
	       if(!isEmpty())
		{
			node temp=first;
                        System.out.print("\n\nALL ELEMENTS IN QUEUE ARE : \n\n\tfirst -> : ");
			while(temp!=null)
			  {
                                System.out.print(temp.data+" : ");
				temp=temp.next;
			  }
                        System.out.print("<- last\n\n");
	        }
	     else
	       {
                        System.out.println("\n\nQueue Is Empty !!!\n");
	       }
	}
      static void insert()
	{
		Scanner read=new Scanner(System.in);
		node temp=new node();
                System.out.print("\nEnter data for insert : ");
		temp.data=read.nextInt();
		last.next=temp;
		last=temp;
	}
         static void delete1()
	   {
		if(!isEmpty())
		  {
                        if(count1()==1)
                                {
				first=last=null;
                                }else{
                                System.out.println("\n\nValue deleted from Queue : "+first.data);
				first=first.next;
                                }
                  }else{
                  System.out.println("\n\nQueue Is Empty !!!\n");
                  }
          }
       static void replace()
	 {
                System.out.println("\n\nCurrent value : "+last.data);
		Scanner read=new Scanner(System.in);
                System.out.print("\nEnter data for replace : ");
		last.data=read.nextInt();
	 }
           static int count1()
	     {
		     if(isEmpty())
			    return 0;
		    else
		     {
                          int count=1;
                          node temp=first;
                          while(temp!=last){
                                     count+=1;
                                     temp=temp.next;
                                     }
                          return count;            
		     }

	     }
          static boolean isEmpty()
	     {
		    if(first==null)
			    return true;
		    else
			    return false;
	     }
  }
