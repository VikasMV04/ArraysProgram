package Programes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class b__ElementPresentAtleastIn2ArraysOutOfGiven3arrays {

	public static void main(String[] args) 
	{
	
		System.out.println("Element present atleast in 2 arrays out of given 3 arrays");
		Integer[] a= {1,2,3,4,5,6};
		Integer[] b= {1,2,33,45,4};
		Integer c[]= {2,34,55,66,45};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
//		Creating HashSet to add all the elements
		HashSet<Integer> list = new HashSet<>();
//		Converting all the arrays to list so  that we can add the data to collection
		List<Integer> a1=Arrays.asList(a);
		List<Integer> a2=Arrays.asList(b);
		List<Integer> a3=Arrays.asList(c);
//		Adding all the elements
		list.addAll(a1);
		list.addAll(a2);
		list.addAll(a3);
//		Creating another list for storing the common elemnts
		List<Integer> finalList=new ArrayList<>();

//		Checking with each two Arrays
		for(Integer number: list)
		{
			if(a1.contains(number)&&a2.contains(number)||
					a2.contains(number)&&a3.contains(number)||
							a3.contains(number)&&a1.contains(number))
			{
				finalList.add(number);
			}
		}
		
		System.out.println("Common Elemnts are "+ finalList);
		System.out.println();
	}

}
