import java.io.*;
import java.util.*;
class vowel
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int count=0;
    System.out.println("Enter the String :");
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++)
    {
    if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||
    str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
    {
        count++;
    }
    }
    System.out.println("The number of vowels in string is : "+count);
    }
}