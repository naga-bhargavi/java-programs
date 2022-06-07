import java.util.*;
class RemoveKeyElement 
{
    	 public int removeElement(int[] nums, int val)
	 {
         	int i=0;
        	for(int j=0;j<nums.length;j++)
       	 	{
            		if(nums[j]!=val)
            		{
                		nums[i]=nums[j];
                		i++;
           		}
        	}
       		 return i;
        
    	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the values of array: ");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("Enter the key value:");
		int key=s.nextInt();
		Solution ss=new Solution();
		int b=ss.removeElement(a,key);
		System.out.println("The number of elements after removing key value:"+b);
		System.out.println("The elements after removing key value:");
		for(int i=0;i<b;i++)
			System.out.print(a[i]+" ");
	}
   
}
