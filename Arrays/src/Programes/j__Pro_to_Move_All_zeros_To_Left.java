package Programes;

import java.util.Arrays;

public class j__Pro_to_Move_All_zeros_To_Left {

	public static void main(String[] args) 
	{
		int[] arr= {1,22,0,0,-2,0,33,5};
		int[] arr1=new int[arr.length];
		arr1=rearange(arr,arr1);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
	}
	//checking with all the elements with zeros
	private static int[] rearange(int[] arr, int[] arr1) 
	{
		//Maintaining a separate index to keep track of arr1 index
		int j=0;
		for (int i = 0; i < arr1.length; i++) 
		{
			if(arr[i]==0)
			{
				arr1[j++]=arr[i];
			}
		}
		
		for (int i = 0; i < arr1.length; i++) 
		{
			if(arr[i]!=0)
			{
				arr1[j++]=arr[i];
			}
		}
		return arr1;
	}

}
