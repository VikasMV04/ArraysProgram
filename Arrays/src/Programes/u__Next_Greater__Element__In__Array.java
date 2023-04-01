package Programes;

import java.util.Iterator;

public class u__Next_Greater__Element__In__Array {

	public static void main(String[] args) 
	{
		int[] a= {2,33,4,57,21,3,1,9};
		int next,i,j;
		for ( i = 0; i < a.length; i++) 
		{
			next=-1;
			for (j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					next=a[j];
					break;
				}
			}
		System.out.println(a[i]+" "+next);
		}
	}

}
