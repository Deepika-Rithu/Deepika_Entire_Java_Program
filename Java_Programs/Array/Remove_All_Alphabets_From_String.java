package Array;

public class Remove_All_Alphabets_From_String
{

		public static void main(String[] args)
		{
			String input="school123";
			String output=input.replaceAll("[a-z]","");
			System.out.println("Input String: "+input);
			System.out.println("Output String: "+output);
		}

	}
