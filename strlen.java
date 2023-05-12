import java.util.*;
import java.io.*;

class strlen
{
	public static void main(String[] args)
	{
	    
	        String a;
	        int d=0;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the string:");
	        a=sc.next();
	        d=a.length();
                System.out.println("The length of the string is:"+d);
		System.out.println("Converted string to uppercase is :"+a.toUpperCase());
                System.out.println("Converted string to lowercase is : "+a.toLowerCase());   
         }
}