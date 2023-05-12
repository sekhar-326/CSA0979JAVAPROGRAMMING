import java.io.*;
import java.util.*;
class hex_convert
{
  public static void main(String args[])
  {
    try
    {
       String num;
       Scanner sc=new Scanner(System.in);
       System.out.println("\nEnter the number :");
       num = sc.nextLine();
       int decimal;
       decimal=Integer.parseInt(num,16);
       String octal = Integer.toOctalString(decimal);
       String binary = Integer.toBinaryString(decimal);
       System.out.println("Decimal Value is : " + decimal);
       System.out.println("Octal Value is : " + octal);
       System.out.println("Binary Value is : " + binary);
    }
    catch(Exception e)
    {
      System.out.println("Due to character exception");
     }
   }
}