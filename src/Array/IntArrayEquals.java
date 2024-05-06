package Array;
import java.util.Arrays;
import java.util.Scanner;
public class IntArrayEquals 
//To check if 2 arrays with int values are equal or not
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int rollno1[]=new int[3];
		System.out.println("Starting of first array");
		for(int i=0;i<rollno1.length;i++)
		{
		System.out.println("Enter the array"+i);
		rollno1[i]=s1.nextInt();
		}
		int rollno2[]=new int[3];
		System.out.println("Starting of second array");
		for(int i=0;i<rollno2.length;i++)
		{
		System.out.println("Enter the array"+i);
		rollno2[i]=s1.nextInt();
		}
		System.out.println("Rollnos 1: "+Arrays.toString(rollno1));
		System.out.println("Rollnos 2: "+Arrays.toString(rollno2));
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
