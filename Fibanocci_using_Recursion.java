import java.util.Scanner;
class rec
{
   
   public int fib(int n)
   {
       if(n==0)
            return 0;
       else if(n==1)
             return 1;
       else
              return fib(n-1)+fib(n-2);
   }
   public static void main(String args[])
   {
     Scanner s=new Scanner(System.in);
     int x;
     System.out.println("enter no.of terms in series: ");
     x=s.nextInt();
     rec o=new rec();
     for(int i=0;i<x;i++)
          System.out.print(o.fib(i)+"	");
    }
}
