@@ -0,0 +1,34 @@
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String args[])
    {
    int n,t,tmp;
    Scanner s = new Scanner(System.in);
    t = s.nextInt();
    tmp= t;
    int []sum;
    sum = new int[t];
    int index = 0;
    while(t!=0)
    {
        n = s.nextInt();
        sum[index]=0; 
        for(int i=0;i<n;i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                sum[index] =sum[index] + i;
            }
        }
        t--;
        index++;
        for(index=0;index<tmp;index++)
        {
         System.out.println(sum[index]);
        
        }
    }
    }
}