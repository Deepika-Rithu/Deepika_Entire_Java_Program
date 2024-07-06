package ExceptionHandling;

public class ExceptionHandling_Pgm1_OneTryOneCatch
{

	public static void main(String[] args)
	{
		try
		{
		int c=1/0;
		System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
		System.out.println("Exception a1 handled");
		}
	}

}
