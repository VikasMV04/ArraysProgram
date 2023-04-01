package DuplicatesAndDeletion;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class b__DeleatAnElementFromArrayUsingStreams {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Deleat an element from Array using streams");
		Integer[] a= {10,20,30,40,50,60};
		System.out.println(Arrays.toString(a));
		System.out.println("Eneter The index to delet number");
		int index=sc.nextInt();
	
		int[] newArr=IntStream.range(0,a.length).filter(i -> i!=index).map(i -> a[i]).toArray();
		System.out.println(Arrays.toString(newArr));
		System.out.println("Enetr the number to delete");
		int num=sc.nextInt();
		int[] newAr=IntStream.range(0,newArr.length).filter(i -> newArr[i]!=num).map(i -> newArr[i]).toArray();
		System.out.println(Arrays.toString(newAr));
		
		System.out.println();
		System.out.println("****************************");

	}

}
