package Array;
import java.util.Arrays;
import java.util.Scanner;
public class BooleanArrayEquals 
//To check if 2 arrays with boolean values are equal or not
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		boolean rollno1[]=new boolean[3];
		System.out.println("Starting of first array");
		for(int i=0;i<rollno1.length;i++)
		{
		System.out.println("Enter the boolean value"+i);
		rollno1[i]=s1.nextBoolean();
		}
		boolean rollno2[]=new boolean[3];
		System.out.println("Starting of second array");
		for(int i=0;i<rollno2.length;i++)
		{
		System.out.println("Enter the boolean value"+i);
		rollno2[i]=s1.nextBoolean();
		}
		System.out.println("Array 1: "+Arrays.toString(rollno1));
		System.out.println("Array 2: "+Arrays.toString(rollno2));
		if(Arrays.equals(rollno1, rollno2)==true)    //Method to find if two arrays are equal or not
		{
			System.out.println("Both the arrays are equal");
		}
		else
		{
			System.out.println("Both the arrays are not equal");
		}
	}

}