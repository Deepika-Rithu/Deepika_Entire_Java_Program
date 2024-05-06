package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_Pgm2_OneTryMultipleCatch 
{
	public static void main(String[] args) 
	{
	Scanner s1=new Scanner(System.in);
	try
	{
	System.out.println("Enter the age");
	int age=s1.nextInt();
	System.out.println(age);
	s1.close();
	}
	catch(InputMismatchException a1)
	{
		System.out.println("Handled Exception a1");
	}
	catch(NullPointerException a2)
	{
		System.out.println("Handled Exception a2");
	}
	catch(StringIndexOutOfBoundsException a3)
	{
		System.out.println("Handled Exception a3");
	}
	catch(ArrayIndexOutOfBoundsException a4)
	{
		System.out.println("Handled Exception a4");
	}
	}
}
