import java.io.*;
import java.util.*;
class dec_convert
{
  public static void main(String args[])
  {
    try
    {
       int num;
       Scanner sc=new Scanner(System.in);
       System.out.println("\nEnter the number :");
       num = Integer.parseInt(sc.nextLine());
       String hexa = Integer.toHexString(num);
       System.out.println("HexaDecimal Value is : " + hexa);
       String octal = Integer.toOctalString(num);
       System.out.println("Octal Value is : " + octal);
       String binary = Integer.toBinaryString(num);
       System.out.println("Binary Value is : " + binary);
    }
    catch(Exception e)
    {
      System.out.println("Due to character exception");
     }
   }
}