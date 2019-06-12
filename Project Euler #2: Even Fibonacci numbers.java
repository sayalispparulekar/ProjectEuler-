 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum;
        int a,b,c;
        a=0;
        for(int a0 = 0; a0 < t; a0++)
        {
           int n = in.nextInt();
           sum=0;
           b=0;
           c=1;
           while(c<n)
            {   
                a = b;
                b = c;
                c = a + b;
                if(c<n)
                {
                    if(c % 2 == 0)
                    {
                        sum = sum + c;
                    }
                }
            }
            
            System.out.println(sum);
        }
    }
}

