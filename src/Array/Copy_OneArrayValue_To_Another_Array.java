package Array;

import java.util.Arrays;

public class Copy_OneArrayValue_To_Another_Array 
{
	public static void main(String[] args)
	{
	String names[]=new String[4];
	names[0]="Ram";
	names[1]="Sita";
	names[2]="Lakshmi";
	names[3]="Vishnu";
	String namescopy[]=new String[names.length];
	for(int i=0;i<names.length;i++)
	{
		namescopy[i]=names[i];
	}
	System.out.println("Original String");
	System.out.println(Arrays.toString(names));
	System.out.println("Copied String");
	System.out.println(Arrays.toString(namescopy));
	}
}
