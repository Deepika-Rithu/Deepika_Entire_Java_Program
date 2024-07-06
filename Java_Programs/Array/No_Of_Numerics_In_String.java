package Array;

public class No_Of_Numerics_In_String
{
	static int countofnumeric=0;
	public static void main(String[] args)
	{
		String input="Deepika123";
		char c1[]=input.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			boolean answer=Character.isDigit(c1[i]);
			if (answer==true)
			{
				countofnumeric++;
			}
		}
		System.out.println("Number of numeric values in the given string is "+countofnumeric);
	}

}
