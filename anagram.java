import java.util.Arrays;
import java.util.Scanner;

class anagram
 {
  public static void main(String[] args)
 {
    Scanner sc= new Scanner(System.in);
    String str1,str2;
    char[] charArray1;
    char[] charArray2; 
    System.out.print("Enter first String: ");
    str1 = sc.nextLine();
    System.out.print("Enter second String: ");
    str2 = sc.nextLine();

    
    if(str1.length() == str2.length()) {

      
      charArray1 = str1.toCharArray();
      charArray2 = str2.toCharArray();

      
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result)
      {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else
      {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    else
     {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }

    
  }
}