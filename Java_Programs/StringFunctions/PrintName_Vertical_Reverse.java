package StringFunctions;

public class PrintName_Vertical_Reverse 
{
static void Name_Reverse()
	{
		String name="Priya";
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.println(name.charAt(i));
		}

	}
	public static void main(String[] args)
	{
		Name_Reverse();
	}

}
