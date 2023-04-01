package Programes;

import java.util.Arrays;

public class f__SecondMinimumNumberInArrayWithOutUsingInBuildFunction {

	public static void main(String[] args) {
		int[] ar= {22,111,20,1,23,33};
	
		int min=ar [0];
		int smin=ar [1];
		for (int i=1; i<ar.length; i++)
		{
		if (min>ar[i])
		{
		smin=min;
		min=ar[i];
		}
		else if (smin>ar[i])
		{
		smin=ar[i];
		}
		}
		System.out.println (Arrays.toString(ar));
		System.out.println ("second Maximum element is "+smin);
		
	}

}
