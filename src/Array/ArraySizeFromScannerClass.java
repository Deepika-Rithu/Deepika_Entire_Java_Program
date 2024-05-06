package Array;

import java.util.Scanner;

public class ArraySizeFromScannerClass
{
	public static void main(String[] args)
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter size of the array");
	int size=s1.nextInt();
	String Students[]=new String[size];
	Students[0]="Ramya";
	Students[1]="Divya";
	Students[2]="Priya";
	s1.close();
	for(int i=0;i<size;i++)
	{
		System.out.println(Students[i]);
	}
	}

}
