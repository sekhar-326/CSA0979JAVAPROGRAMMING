import java.io.*;
import java.util.*;
class base
{
	int i;
	base(int a)
	{
		i=a;
	}
}
class derived extends base
{
	int i;
	int j;
	derived(int a,int b)
	{
		super(a);
		i=a;
		j=b;
	}
	void print()
	{
		System.out.println("Base");
		System.out.println(super.i);
		System.out.println("Derived");
		System.out.println(j);
	}
}

class method_overriding
{
	public static void main(String []arg)
	{
           try
           {
                Scanner sc=new Scanner(System.in);
                int a,b,c;
                System.out.println();
                a=sc.nextInt();
                System.out.println();
                b=sc.nextInt();
		derived d = new derived(a,b);
		d.print();
           }
           catch(Exception e)
           {
              System.out.println("Due to string exception or number format exception");
           }
	}
}