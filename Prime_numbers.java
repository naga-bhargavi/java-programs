import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the no.of terms: ");
      int n=s.nextInt();
      System.out.println("The prime numbers are: ");
      for(int i=2;i<n;i++)
      {
        int count=0;
        for(int j=1;j<=i;j++)
        {
           if(i%j==0)
               count=count+1;
         }
         if(count==2)
            System.out.println(i);
       
        }
     }

}
