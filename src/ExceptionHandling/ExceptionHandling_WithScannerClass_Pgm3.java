package ExceptionHandling;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling_WithScannerClass_Pgm3
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of array");
		try
		{
		int n1=s1.nextInt();
		String name[]=new String[n1];
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Laxman";
		name[3]="Hanuman";
		System.out.println(Arrays.toString(name));
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("The size of array should be 4 not more or less than that");
		}
		catch(InputMismatchException a2)
		{
			System.out.println("The size of the array should be a number");
		}
	}
}
