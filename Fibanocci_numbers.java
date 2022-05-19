import java.util.Scanner;
class Fib
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=1,m=0;
      System.out.println("Enter the no.of terms: ");
      int k=s.nextInt();
      System.out.println("Fibanocci series upto k terms: ");
      System.out.println(m);
      System.out.println(n);
      for(int i=0;i<=k;i++)
      {
        int t=m+n;
        System.out.println(t);
        m=n;
        n=t;
       }
     }
}
