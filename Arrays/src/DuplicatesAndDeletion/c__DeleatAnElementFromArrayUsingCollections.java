package DuplicatesAndDeletion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class c__DeleatAnElementFromArrayUsingCollections {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Deleat an element from Array using collections");
		
		String[] names= {"Raj","Sam","Vikram"};
		System.out.println(Arrays.toString(names));
		
		List<String> nn=new ArrayList<>(Arrays.asList(names));
		
		System.out.println("Eneter the index to delete");
		int index=sc.nextInt();
		nn.remove(index);
		System.out.println(nn);
	}

}
