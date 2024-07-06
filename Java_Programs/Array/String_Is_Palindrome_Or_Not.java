package Array;

public class String_Is_Palindrome_Or_Not 
{
	public static void main(String[] args) 
	{
		String input="madam";
		String reverse="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			reverse=reverse+c1;
		}
		System.out.println("The input string is "+input);
		System.out.println("The reversed string is "+reverse);
		if(input.equals(reverse))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}

}
