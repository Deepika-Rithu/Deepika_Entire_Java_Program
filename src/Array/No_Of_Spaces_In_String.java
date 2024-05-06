package Array;

public class No_Of_Spaces_In_String 
{
	static int countofspaces=0;
	public static void main(String[] args)
	{
		String name="Deepika Vignesh Rithu";
		char c1[]=name.toCharArray();      //converts the string to char array
		for(int i=0;i<c1.length;i++)
		{
			boolean answer=Character.isSpaceChar(c1[i]);  //checks if the character is a space
			if(answer==true)
			{
				countofspaces++;
			}
		}
			System.out.println("Number of spaces in the given string is "+countofspaces);	
	}

}