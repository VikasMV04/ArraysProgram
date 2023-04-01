package Programes;

import java.util.Arrays;

public class w__Sorting_names_in_Array {

	public static void main(String[] args) 
	{
		String[] a= {"Grapes","Mango","Pineapple","Bannana"};
		
		String l="d";
		String ll="c";
		System.out.println(l.compareTo(ll));
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
