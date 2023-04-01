package Programes;

import java.util.Arrays;

public class y__Finding_pairs_for_given_Sum {

	public static void main(String[] args) 
	{
		int[] a= {2,5,4,1,6,9,45,3};
		Arrays.sort(a);
		int low=0;
		int high=a.length-1;
		int sum=5;
		while(low<high) 
		{
			if(a[low] + a[high]>sum)
			 high--;
			else if(a[low]+a[high]<sum)
				low++;
			else if(a[low]+a[high]==sum) {
				System.out.println(a[high]+","+a[low]);
				high--;low++;
			}
		}
	}

}
