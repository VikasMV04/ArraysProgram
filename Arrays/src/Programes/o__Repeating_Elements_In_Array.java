package Programes;

import java.util.Arrays;

public class o__Repeating_Elements_In_Array {

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,23,1,2,3,1,2,3,23};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int lstele = arr[arr.length-1];

		int[] temp=new int[lstele];
		
		for (int i = 0;i<arr.length; i++) 
		{
			if(temp[arr[i]-1]==1)
			{
				System.out.println(arr[i]);
			}else
				temp[arr[i]-1]++;
		}
	}
}
