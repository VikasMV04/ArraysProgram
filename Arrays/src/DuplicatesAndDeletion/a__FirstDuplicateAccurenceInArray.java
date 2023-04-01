package DuplicatesAndDeletion;

import java.util.Arrays;
import java.util.Scanner;

public class a__FirstDuplicateAccurenceInArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("First Duplicate accurence in array");
		
		Integer[] a= {1,2,5,3,4,5,6};
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
		System.out.println();	

	}

}
