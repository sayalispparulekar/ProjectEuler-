import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static long prime(long n)
    {
        long a[];
        a = new long[20];
        long temp = 0;
        int j = 0;
            a[j]=0;
            for (int i = 2; i <= n; i++) 
            {
                while (n % i == 0) 
                {
                    a[j] = i;
                    j++;
                    if(a[j-1]>a[j])
                    {
                        temp = a[j];
                        a[j] = a[j-1];
                        a[j-1] = temp;
                    }
                    n = n / i;
                }
                
            }
            
        
 
       return a[j]; 
    }
    private static void printprime(long n) {
        System.out.println(prime(n));
    }

    public static void main(String[] args) 
    {
         Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            long n = in.nextLong();
            printprime(n);
        }
        
    }
}

