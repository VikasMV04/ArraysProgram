package Programes;

import java.util.Arrays;

public class h__MissingElementsInArray {

	public static void main(String[] args) {
		System.out.println("Missing Elements in array");
		int arr[]= {1,2,3,4,6};
		
		System.out.println(Arrays.toString(arr));
		int n=arr.length+1;
		//formula to find sum of numbers in given range
		int chk=(n*(n+1))/2;
		int sum=0;
		for (int i:arr) 
		{
			sum+=i;
		}
		int missing_element=chk-sum;
		if(missing_element>0)
		System.out.println("Missing element = "+missing_element);
		
		System.out.println();
	}

}
