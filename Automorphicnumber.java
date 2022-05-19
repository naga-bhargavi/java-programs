import java.util.*;
class Automorphicnumber
{
        
	public int reverse(int x)
	{
	    int i=x;
	     int rev1=0;
              while(i!=0)
              { 
                  int r1=0;
                  r1=i%10;
                  rev1=(rev1*10)+r1;
	          i=i/10;
                }
		return rev1;
	}
	public int lastnum(int x,int y)
	{
		int count=0;
		int d=x;
		int ll=y;
                int last=0;
                while(count!=ll)
		{
                    int r;
		    r=d%10;
		    last=(last*10)+r;
		    count=count+1;
		    d=d/10;
		}
		return last;
	}
      
       public static void main(String args[])
        {
              int n,l=0;
              Scanner s=new Scanner(System.in);
              System.out.println("Enter the number: ");
              n=s.nextInt();
              int tn=n;
              int ns=n*n;
              while(tn!=0)
              {
                 l=l+1;
                 tn=tn/10;
               }
              Automorphicnumber o=new Automorphicnumber();
              int b=o.lastnum(ns,l);
	      int c=o.reverse(b);
              
                if(c==n)
                      System.out.println("The given number is Auto morphic number");
                else
                    System.out.println("The given number is not  Auto morphic number");
          }
}
