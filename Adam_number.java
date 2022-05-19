import java.util.Scanner;
class adam
{
       int n;
       public int reverse(int a)
       {
          n=a;
          int  rev=0;
          int r=0;
          while(n!=0)
          {
             r=n%10;
              rev=(rev*10)+r;
             n=n/10;
           }
            return rev;
         }
       public static void main(String args[])
       {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the number: ");
            int p=s.nextInt();
            int ps=p*p;
            adam o=new adam();
            int q=o.reverse(p);
            int qs=q*q;
            int t=o.reverse(qs);
            if(ps==t)
                    System.out.println("The number is adam number ");
            else
                 System.out.println("The number is not adam number ");
         }
}
