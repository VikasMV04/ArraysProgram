package Programes;

import java.util.Stack;

public class t__Reverse_Array_Using_Stack {

	public static void main(String[] args) 
	{	
		int a[]= {1,2,3,4};
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < a.length; i++) 
		{
			s.push(a[i]);
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=(int)s.pop();
			System.out.println(a[i]);
		}
	}

}
