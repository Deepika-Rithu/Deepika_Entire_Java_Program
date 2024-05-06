package Package1;
public class Main_Method_Overloading 
{
	public static void main(String[] args)
	{
		System.out.println("Main method with String argument");
		main();
		main(67);
		main("Hello");
	}
	
	public static void main()
	{
		System.out.println("Main method with no parameter");
	}
	public static void main(int a)
	{
		System.out.println("Main method with int parameter");
	}
	public static void main(String b)
	{
		System.out.println("Main method with string parameter");
	}
}
