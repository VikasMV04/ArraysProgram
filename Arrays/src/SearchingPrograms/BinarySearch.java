package SearchingPrograms;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] a= {20,30,40,50,60,78};
		
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		int key=608;
		boolean flag=false;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(key==a[mid])
			{
				 flag = true;
				 break;
			}
			else if(key>a[mid])
			{
				low=mid+1;
				
			}else if(key<a[mid])
			{
				high=mid-1;
				
			}
		}
		if(flag)
			System.out.println("Element found");
		else
			System.out.println("not found found");
	}

}
