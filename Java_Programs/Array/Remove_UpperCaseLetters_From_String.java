package Array;

public class Remove_UpperCaseLetters_From_String
{
	public static void main(String[] args)
	{
		String input="School123";
		String output=input.replaceAll("[A-Z]","");
		System.out.println("Input String: "+input);
		System.out.println("Output String: "+output);
	}
}
