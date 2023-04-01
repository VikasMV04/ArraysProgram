package Programes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class a__ArraysToArraylist {

	public static void main(String[] args)
	{
	//tHERE ARE THREE WAYS TO CONVERT ARRAY TO LIST
		System.out.println("1st Method");
		String[] days= {"Monday","tuesday","Wednesday"};
		List list=Arrays.asList(days);
		System.out.println(list);
		
		System.out.println("2nd Method");
		List<String> l = new ArrayList<>();
		Collections.addAll(l, days);
		System.out.println(l);
		
		System.out.println("3rd Method");
		List<String> la = new ArrayList<>();
//		Without using inbuild functions
		for(String s:days)
		{
			la.add(s);
		}
		System.out.println(la);
	}

}
