package Programes;

import java.util.Arrays;

public class e__SecondMaximumNumberInArrayWithOutUsingInBuildFunction {

	public static void main(String[] args) {
		int[] ar= {111,35,20,1,23,33};

		int fbig=ar [0];
		int sbig=ar [1];
		for (int i=1; i<ar.length; i++)
		{
		if (fbig<ar[i])
		{
		sbig=fbig;
		fbig=ar[i];
		}
		else if (sbig<ar[i])
		{
		sbig=ar[i];
		}
		}
		System.out.println (Arrays.toString(ar));
		System.out.println ("second Maximum element is "+sbig);

	}

}
