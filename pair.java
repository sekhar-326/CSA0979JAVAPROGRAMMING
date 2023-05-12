import java.io.*;
import java.util.*;
class pair
{
  public static void main(String args[])
  {
  int i,j,sum,n;
  int []arr;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no.of.elemets:");
  n=sc.nextInt();
  arr=new int[n];
  System.out.println("Enter the elemets:");
  for(i=0;i<n;i++)
  {
     arr[i]=sc.nextInt();
  }
  System.out.println("Enter the sum:");
  sum=sc.nextInt();
  for (i = 0; i < n; i++)
  {
    for (j = i + 1; j < n; j++)
    {
       if (arr[i] + arr[j] == sum)
       {
	  System.out.println("(" + arr[i] + ", " + arr[j] + ")");
       }
     }
  }
}
}