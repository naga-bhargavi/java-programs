import java.util.Scanner;
class TwoSum
{
	public int[] twosum(int a[],int target)
	{
		int k[]=new int[2];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					k[0]=i;
					k[1]=j;
				}
			}
		}
		
		return k;
			
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.println("Enter the target value: ");
		int tar=s.nextInt();
		TwoSum obj=new TwoSum();
		int nums[]=obj.twosum(arr,tar);
		System.out.println("The two numbers index values whose sum gives the target are:");
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
	}
}
