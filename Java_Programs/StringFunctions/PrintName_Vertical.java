package StringFunctions;

public class PrintName_Vertical
{
	public static void main(String[] args)
	{
		String name="Priya";
		for(int i=0;i<name.length();i++)
		{
					System.out.print(name.charAt(i));
		}
		System.out.println();
		for(int i=0;i<name.length();i++)
		{
					System.out.println(name.charAt(i));
		}
	}

}
