package Array;

import java.util.Arrays;

public class No_Of_Special_Characters_In_String 
{
	static int countofalphabets=0;
	static int countofnumeric=0;
	static int countofspaces=0;
	static int countofspecialchar;
	public static void main(String[] args)
	{
		String name="!Deep@ika#$";
		char c1[]=name.toCharArray();  
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			boolean answer=Character.isAlphabetic(c1[i]); 
			if(answer==true)
			{
				countofalphabets++;
			}
		}
		for(int i=0;i<c1.length;i++)
		{
			boolean answer=Character.isDigit(c1[i]);
			if (answer==true)
			{
				countofnumeric++;
			}
		}
		for(int i=0;i<c1.length;i++)
		{
			boolean answer=Character.isSpaceChar(c1[i]);  
			if(answer==true)
			{
				countofspaces++;
			}
		}
		System.out.println("Number of alphabets in the given string is "+countofalphabets);	
		System.out.println("Number of numeric values in the given string is "+countofnumeric);
		System.out.println("Number of spaces in the given string is "+countofspaces);
		System.out.println("Length of the given string is "+name.length());
		
		countofspecialchar=(name.length()-(countofalphabets+countofnumeric+countofspaces));
			System.out.println("Number of special characters in the given string is "+countofspecialchar);	
			}
}