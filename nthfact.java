import java.io.*;
import java.util.*;
class factor
{
   public static void main(String args[])
   {
       try
        {
          Scanner sc=new Scanner(System.in);
          int count=0,n=100,i,j=0,N;
          int []a=new int [10];
          System.out.println("Enter the number:");
          n=sc.nextInt();
          System.out.println("Enter the value of N:");
          N=sc.nextInt();
          if(n<=0)
          {
            System.out.println("Enter valid number");
          }
          else
          {
             for(i=1;i<=n;i++)
             {
               if(n%i==0)
               {
	          a[j] = i;
	          count++;
		  j++;
               }
             }
             System.out.println("The number of factors:"+count);
             System.out.println(N + " th factor " + a[N-1]);
         }
	
       }
        catch(Exception e)
        {
           System.out.println("Enter only numbers");
        }
    }
}