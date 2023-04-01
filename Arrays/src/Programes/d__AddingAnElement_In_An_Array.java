package Programes;

import java.util.Arrays;
import java.util.Scanner;

public class d__AddingAnElement_In_An_Array {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int b[]= new int[a.length+1];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index vale to be inserted");
		int index=sc.nextInt();
		System.out.println("Eneter the value");
		int no=sc.nextInt();
		int ind=0;
		for (int i = 0; i < b.length; i++) 
		{
			if(i==index)  b[i]=no;
			else {
				b[i]=a[ind++];
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
