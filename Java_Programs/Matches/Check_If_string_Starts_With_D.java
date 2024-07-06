package Matches;

public class Check_If_string_Starts_With_D
{
	public static void main(String[] args)
	{
		String Input="Deepika";
		boolean ans=Input.matches("D.*");
		if(ans==true)
		{
			System.out.println("The given string starts with D");
		}
		else
		{
			System.out.println("The given string does not start with D");
		}
	}

}
