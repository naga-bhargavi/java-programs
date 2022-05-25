import java.util.Scanner;
class DuplicateNumbers
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the array size: ");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
		}
		System.out.println("Values After removing duplicates: ");
		for(int i=0;i<n;i++)
		{
			if(a[i]==0)
				continue;
			else
				System.out.print(a[i]+"  ");
		}
	}
}
