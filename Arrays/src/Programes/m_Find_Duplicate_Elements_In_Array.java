package Programes;

import java.util.HashSet;
import java.util.Set;

public class m_Find_Duplicate_Elements_In_Array {

	public static void main(String[] args) 
	{
		int[] ar= {10,20,20,30,10,29,40,50,10};
		bruceforceApproach(ar);
		extraMemoryApproach(ar);
	}

	private static void extraMemoryApproach(int[] ar) 
	{
		Set<Integer> set= new HashSet<>();
		for (int i = 0; i < ar.length; i++) 
		{
			if(set.contains(ar[i]))
				System.out.println("Duplicate element = "+ar[i]);
			else
				set.add(ar[i]);
		}
		
	}

	private static void bruceforceApproach(int[] ar)
	{
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = i+1; j < ar.length; j++) 
			{
				if(ar[i]==ar[j])
					System.out.println("Duplicate element = "+ar[i]);
			}
		}
		
	}

}
