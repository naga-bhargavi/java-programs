import java.util.Scanner;
class Sort
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
		System.out.println("Values before sorting :");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Values After sorting: ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"  ");
	}
}

		
