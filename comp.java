import java.io.*;
import java.util.*;
public class composite
{
    public static void main(String[] args)
    {
        int c_count=0,size;
        float[] arr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Elements :");
        size=sc.nextInt();
        arr = new float[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextFloat();
        for (int j = 0; j < size; j++) {
        int count = 0;
        if (arr[j] > 0) {
        for (int k = 1; k <= arr[j]; k++) {
        if (arr[j] % k == 0)
        count++;
        }
        if (count > 2)
        c_count++;
        }
        }
        System.out.println("No. of composite num: " + c_count); 
        }

        }
}
        
    