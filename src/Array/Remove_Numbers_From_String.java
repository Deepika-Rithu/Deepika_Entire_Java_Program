package Array;

public class Remove_Numbers_From_String 
{

	public static void main(String[] args) 
	{
		String input="School123";
		String output=input.replaceAll("[0-9]","");
		System.out.println("Input String: "+input);
		System.out.println("Output String: "+output);

	}

}
