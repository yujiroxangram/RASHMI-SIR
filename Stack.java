 import java.util.*;
class Plate
	{
        int data;
        Plate next;
	}
public class Stack
	{
        Scanner read=new Scanner(System.in);
        static Plate top;
        public static void main(String args[])
	      {
              System.out.println("\n\n\t\t~~~~~~~~~~ WELCOME~~~~~~~~~~\n");
              System.out.println("With the help of this program we can create and update one stack.\n");
              System.out.println("This program coded in JAVA using java \n");
              System.out.println("Thanks you a lot for trying this.....\n\n\n");
              while (true)
		{
                new Stack().menu();
		}
	}
    void menu()
        {
        Stack stk=new Stack();
        System.out.println("\t\t\t\tSTACK MENU");
        System.out.println("\t\t\t\t==========");
        System.out.println("\n\n\t\t\t1.create\t2.Traverse\n\t\t\t3.insert(PUSH)\t4.replace top element\n\t\t\t5.delete(POP)\t6.Show TOP\n\n\t\t\t7. EXIT");
        System.out.print("\n\nEnter your choice : ");
        int choice=read.nextInt();
        switch(choice)
	       {
               case 1:
                    stk.create();
                    break;
               case 2:
                    stk.traverse();
                    break;       
               case 3:
                    stk.push();
                    break;
               case 4:
                    stk.replace();
                    break;
               case 5:
                    stk.pop();
                    break;
               case 6:
                    stk.top_value();
                    break;
               case 7:
                    System.exit(0);
               default:
                    System.out.println("\n\n\t\tInvalid Input !!!\n");
	      }
     }
	void replace()
                {
                System.out.println("Current value : "+top.data);
                System.out.print("Enter new value : ");
		top.data=read.nextInt();
                }
	void create()
                {
		Scanner read=new Scanner(System.in);
                System.out.print("\n\nEnter -1 to stop entering data");
		Plate temp=new Plate();
		top=temp;
		int i=2;
                System.out.print("\nEnter data no. 1 : ");
		temp.data=read.nextInt();
		if(top.data!=-1)
                        {
			while(true)
                                {
				Plate temp1=new Plate();
                                System.out.print("\nEnter data no. "+i+" : ");
		                temp1.data=read.nextInt();
		                if(temp1.data==-1)
                                        break;
		                temp1.next=top;
		                top=temp1;
		                i++;
                                }
                         }else{
                         top=null;
                         }
                }
	  void push()
                {
		Plate temp=new Plate();
                System.out.print("\n\n\nEnter data for push : ");
                temp.data=read.nextInt();
                temp.next=top;
                top=temp;
                }
	void pop()
                {
                System.out.println("\n\nValue poped from Stack : "+top.data);
                top=top.next;
                }
	void top_value()
                {
                System.out.println("\n\nTOP Value from Stack : "+top.data);
                }
	void traverse()
                {
		if(top!=null)
                        {
                        System.out.println("\n\nCurrently Present Data are ......\n\n");
			Plate temp=top;
			while(temp!=null)
                                {
                                System.out.println("\t");
                                System.out.print("\t|\t");
				System.out.print(temp.data);
                                System.out.println("\t|");
				temp=temp.next;
                                }
                        System.out.println("\t");
                        }else{
                        System.out.println("\n\n\tNo Stack created !!!");
                        }
                }
        }
