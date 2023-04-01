package Programes;

import java.util.Arrays;

public class i__Pro_to_Move_All_negative_number_To_Left {

	public static void main(String[] args) 
	{
		int[] arr= {1,22,-2,-77,-44,2,33,5};
		int[] arr1=new int[arr.length];
		arr1=rearange(arr,arr1);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
	}

	private static int[] rearange(int[] arr, int[] arr1) 
	{
		int j=0;
		for (int i = 0; i < arr1.length; i++) 
		{
			if(arr[i]<0)
			{
				arr1[j++]=arr[i];
			}
		}
		
		for (int i = 0; i < arr1.length; i++) 
		{
			if(arr[i]>=0)
			{
				arr1[j++]=arr[i];
			}
		}
		return arr1;
	}

}
