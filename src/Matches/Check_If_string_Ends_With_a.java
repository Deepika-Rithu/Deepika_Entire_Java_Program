package Matches;

public class Check_If_string_Ends_With_a 
{

	public static void main(String[] args)
	{
		String Input="Deepika";
		boolean ans=Input.matches(".*a");
		if(ans==true)
		{
			System.out.println("The given string ends with a");
		}
		else
		{
			System.out.println("The given string does not end with a");
		}
	}

}
