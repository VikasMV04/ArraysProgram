package Programes;

import java.util.Arrays;

public class v__WAJP_To_Squsre_Positive_Negative_Numbers_And_Sort_it {

	public static void main(String[] args) 
	{
		int[] a= {-6,4,2,-1,7};
		int[] square= new int[a.length];
		int start=0;
		int end=a.length-1;
		int sqrind=square.length-1;
		while(start<=end)
		{
			int strt=a[start]*a[start];
			int ed=a[end]*a[end];
			if(strt>ed)
			{
				square[sqrind--]=strt;
				start++;
			}
			else {
				square[sqrind--]=ed;
				end--;
			}
		}
		System.out.println(Arrays.toString(square));
	}

}
