package StringFunctions;

public class Reverse_String 
{
	static void Name_Reverse()
	{
		String name="Deepika";
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}

	}
	public static void main(String[] args)
	{
		Name_Reverse();
	}
}
