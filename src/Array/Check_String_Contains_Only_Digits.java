package Array;
import java.util.Arrays;
public class Check_String_Contains_Only_Digits
{
static int digits=0;
	public static void main(String[] args) 
	{
		String input="271191";
		char[] c1=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			boolean ans=Character.isDigit(c1[i]);
			if (ans==true)
			{
				digits++;
			}
		}
		if(digits==input.length())
		{
			System.out.println("The given string contains only digits");
		}
		else
		{
			System.out.println("The given string contains characters other than digits");
		}
	}
}
