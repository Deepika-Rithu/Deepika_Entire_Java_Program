package Matches;

public class Check_If_String_Has_5_Characters
{

	public static void main(String[] args)
	{
		String Input="Deepi";
		boolean ans=Input.matches(".....");
		if(ans==true)
		{
			System.out.println("The given string has 5 characters");
		}
		else
		{
			System.out.println("The given string has more than or less than 5 characters");
		}

	}

}
