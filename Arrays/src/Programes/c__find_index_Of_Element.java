package Programes;

public class c__find_index_Of_Element {

	public static void main(String[] args) 
	{
	String[] colors = {"Red","Blue","Green","White"};
	int index=0;
	for (int i = 0; i < colors.length; i++) 
	{
		if(colors[i]=="Blue")
			index=i;
	}
	System.out.println("Index = "+index);
	}

}
