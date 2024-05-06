package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValueFromScannerClass
{
	public static void main(String[] args) 
	{
	int rollno[]=new int[3];
	Scanner s1=new Scanner(System.in);
	/*System.out.println("Enter the roll numbers");
	rollno[0]=s1.nextInt();
	rollno[1]=s1.nextInt();
	rollno[2]=s1.nextInt();
	System.out.println("The roll numbers are");
	System.out.println(rollno[0]);
	System.out.println(rollno[1]);
	System.out.println(rollno[2]);*/
	
	for(int i=0;i<rollno.length;i++)
	{
		System.out.println("Enter the array "+i);
		rollno[i]=s1.nextInt();
		
	}
	System.out.println("Rollnos: "+Arrays.toString(rollno));

	}

}
