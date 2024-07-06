package Array;
public class No_Of_Alphabets_In_String
{
	static int countofalphabets=0;
	public static void main(String[] args)
	{
		String name="Deepika";
		char c1[]=name.toCharArray();  //converts the string to char array
		for(int i=0;i<c1.length;i++)
		{
			boolean answer=Character.isAlphabetic(c1[i]);  //checks if the character is alphabet
			if(answer==true)
			{
				countofalphabets++;
			}
		}
			System.out.println("Number of alphabets in the given string is "+countofalphabets);	
	}

}
