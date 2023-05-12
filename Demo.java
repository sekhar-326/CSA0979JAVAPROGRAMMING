import java.io.*;
import java.util.*;
class OddOccurrence 
{
	static int getOddOccurrence(int arr[], int arr_size)
	{
		int i;
		for (i = 0; i < arr_size; i++) {
			int count = 0;
			for (int j = 0; j < arr_size; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count % 2 != 0)
				return arr[i];
		}
		return -1;
	}
        static int getEvenOccurrence(int arr[], int arr_size)
	{
		int i;
		for (i = 0; i < arr_size; i++) {
			int count = 0;
			for (int j = 0; j < arr_size; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count % 2 == 0)
				return arr[i];
		}
		return -1;
	}
	
	
	public static void main(String[] args)
	{
                Scanner sc=new Scanner(System.in);
		int arr[];
                int n1;
                System.out.println("Enter the no.of.elements:");
                n1=sc.nextInt();
                arr=new int[n1];
                for(int k=0;k<n1;k++)
                {
                   arr[k]=sc.nextInt();
                 }
		int n = arr.length;
		System.out.println("The number in odd occurence:"+getOddOccurrence(arr, n));
                System.out.println("The number in even occurence:"+getEvenOccurrence(arr, n));
	}
}
