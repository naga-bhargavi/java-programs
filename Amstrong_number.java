import java.util.*;
class ams
{
   public static void main(String args[])
    {
         int n;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the value : ");
         n=s.nextInt();
         int temp=n;
         int p=n;
         int l=0;
         while(n!=0)
         {
            n=n/10;
           l=l+1;
          }
         System.out.println("The length of the number is: "+l);
         double x=0;
         while(temp!=0)
         {
            int r=0;
            r=temp%10;
             x=x+(Math.pow(r,l));
            temp=temp/10;
          }
	   
         System.out.println(x);
           if(p==x)
                 System.out.println("Amstrong number ");
           else
                 System.out.println("not an anstrong number");   
     }
}
