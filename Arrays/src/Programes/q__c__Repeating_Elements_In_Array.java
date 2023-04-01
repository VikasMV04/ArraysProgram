package Programes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class q__c__Repeating_Elements_In_Array {

	public static void main(String[] args) {
		Integer a[]={55,1,22,88,55,2,899,899,1,2,1};
		System.out.println(Arrays.toString(a));
		
		Map<Integer,Integer> pair = new HashMap<>() ;
		for(int i=0;i<a.length;i++)
		{
			pair.put(a[i],pair.getOrDefault(a[i], 0)+1);
		}
		
		for(Integer no:pair.keySet()) 
		{
			if(pair.get(no)>1)
//			System.out.println(no+" : "+pair.get(no));
				System.out.print(no+" ");
		}

	}

}
