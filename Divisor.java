//for the integers range  to 100 find the number that has more divisors
public class Divisor
        {
        public static void main(String args[])
                {
                int max=0,count=0,i,j,k=0;
                for(i=1;i<=100;i++)
                        {
                        //i=1;
                        for(j=1;j<=i;j++)
                                {
                                if(i%j==0)
                                        {
                                        count++;
                                        }
                                 if(count>max)
                                        {
                                        max=count;
                                        k=i;
                                        }
                                 }
                        System.out.println(max+"\t"+k);
                        }
                }
       }


                             
                             
