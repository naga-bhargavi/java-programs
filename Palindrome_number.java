import java.util.Scanner;
class Palin
{
   public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number to check for palidnrome: ");
      int n=s.nextInt();
      int rev=0;
      while(n!=0)
      {
         int rem=0;
         rem=n%10;
         rev=rev*10+rem;
         n=n/10;
       }
      if(n==rev)
         System.out.println("The given number is a palindrome");
      else
         System.out.println("The given number is not a palindrome");
    }
}

          
