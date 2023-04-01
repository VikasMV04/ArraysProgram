package Programes;

public class n__Find_Pair_with_givenSum {

	public static void main(String[] args) 
	{
		int ar[]= {10,20,30,40,44,50};
		int sum=50;
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = i+1; j < ar.length; j++) 
			{
				if(ar[j]==sum-ar[i])
					System.out.println("Pairs = "+ar[i]+" "+ar[j]);
			}
		}
	}

}
