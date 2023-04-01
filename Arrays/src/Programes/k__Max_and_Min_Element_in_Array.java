package Programes;

import java.util.Scanner;

public class k__Max_and_Min_Element_in_Array {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enetr the numbers");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(min>arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Value = "+max);
		System.out.println("Minimum Value = "+min);
		
	}

}
