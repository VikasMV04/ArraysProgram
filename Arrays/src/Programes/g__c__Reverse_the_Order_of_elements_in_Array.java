package Programes;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class g__c__Reverse_the_Order_of_elements_in_Array {

	public static void main(String[] args) 
	{
		List <Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(2);
		a1.add(3);
		a1.add(5);
		//before reversing
		System.out.println(a1);
		Collections.reverse(a1);
		//After Reversing
		System.out.println(a1);
	}

}
