import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
       int n=A.length();
      String b="";
      for(int i=n-1;i>=0;i--)
      {
          b=b+A.charAt(i);
      }
      int count=0;
            for(int i=0;i<n;i++)
            {
                if(A.charAt(i)==b.charAt(i))
                {
                    count=count+1;
                }
            }
            if(count==n)
                System.out.println("Yes");
            else
                System.out.println("No");   
        /* Enter your code here. Print output to STDOUT. */
        
    }
}


