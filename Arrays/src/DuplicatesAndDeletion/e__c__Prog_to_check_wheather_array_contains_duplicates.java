package DuplicatesAndDeletion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class e__c__Prog_to_check_wheather_array_contains_duplicates {

	public static void main(String[] args) 
	{
		String[] names= {"vikas","mahi","mahi","preksha"};
		List<String> dupliclists=Arrays.asList(names);
		Set<String> nondulpi= new HashSet<>(dupliclists);
		if(dupliclists.size()!=nondulpi.size())
		{
			System.out.println("Array Contains Duplicates");
		}
		else
			System.out.println("Array does not contains Duplicats");
	}

}
