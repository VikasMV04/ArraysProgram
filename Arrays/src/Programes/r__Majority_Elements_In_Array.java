package Programes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class r__Majority_Elements_In_Array {
//If an element appears more then arraysize/2 times we call it as majority elements 
	public static void main(String[] args) 
	{
		Integer a[]={55,1,1,88,1,2,1,899,1,2,1};
		System.out.println(Arrays.toString(a));
		
		Map<Integer,Integer> pair = new HashMap<>() ;
		for(int i=0;i<a.length;i++)
		{
			pair.put(a[i],pair.getOrDefault(a[i], 0)+1);
		}
		
		System.out.println("Majority Elements");
		for(Integer no:pair.keySet()) 
		{
			if(pair.get(no)>a.length/2)
//			System.out.println(no+" : "+pair.get(no));
				System.out.print(no+" ");
		}
	}

}
