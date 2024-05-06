package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Finally 
{
	public static void main(String[] args)
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the age");
	try
	{
		int age=s1.nextInt();
		System.out.println(age);
	}
	catch(InputMismatchException a1)
	{
		System.out.println("Handled the exception");
	}
	finally
	{
		System.out.println("Thankyou for visiting us.Come back again.");
	}
	}

}
