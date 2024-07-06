package Package1;

public class Print_Println
{
	static void print()
	{
		System.out.println("Print:");
		String name="Deepika";
		for(int i=0;i<name.length();i++)
		{
			System.out.print(name.charAt(i));
			
		}
	}
	static void println()
	{
		System.out.println("Println:");
		String name="Deepika";
		for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));
			
		}
	}
	public static void main(String[] args)
	{
		print();
		System.out.println();
		println();

	}

}
