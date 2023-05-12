import java.util.*;
class rome1
{
static int romanToInt(String s)
 {
HashMap<Character,Integer>map=new HashMap<Character,Integer>();

     map.put('I',1);
     map.put('V',5);
     map.put('X',10);
     map.put('L',50);
     map.put('C',100);
     map.put('D',500);
     map.put('M',1000);
    int result=map.get(s.charAt(s.length()-1));
    for(int i=s.length()-1;i>0;i--)
    {
        if(map.get(s.charAt(i))<=map.get(s.charAt(i-1)))
        {
            result+=map.get(s.charAt(i-1));
        }
        else
        {
            result-=map.get(s.charAt(i-1));
        }
    }
    return result;
}
public static void main(String args[])
{
 try
 {
 Scanner sc=new Scanner(System.in);
 String s1;
 System.out.println("Enter the string:");
 s1=sc.next();
 int b=romanToInt(s1);
 System.out.println(b);
 }
catch(Exception e)
{
   System.out.println("Enter the correct string");
}
}
}