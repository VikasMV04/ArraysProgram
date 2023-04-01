package Programes;

import java.util.Arrays;

public class p__Repeating_Elements_In_Array 
{

	public static void main(String[] args) {
		int a[]={55,1,22,88,55,2,899,899,1,2,1};
		System.out.println(Arrays.toString(a));
		int v[]=new int[a.length];
		for (int i = 0; i < a.length-1; i++) 
		{
			int count=1;
			boolean flag=isvisted(v,a[i]);
			if(flag)
			{
				for (int j = i+1; j < v.length; j++) 
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				v[i]=a[i];
			}else
			{
				System.out.print(a[i]+" ");
			}
		}
	}

	private static boolean isvisted(int[] v,int no) 
	{
		for (int i = 0; i < v.length; i++) 
		{
			if(no==v[i])
				return false;
		}
		return true;
	}


	}


