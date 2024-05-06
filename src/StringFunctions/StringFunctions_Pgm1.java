package StringFunctions;

public class StringFunctions_Pgm1 
{
public static void main(String[] args)
{
	String name="Rithanyaa";
	String name2="Rithanyaa";
	if(name.equals(name2)==true)
	{
		System.out.println("Both names are same");
	}
	else
	{
		System.out.println("Both names are different");
	}
	System.out.println(name.length());
	System.out.println(name.charAt(5));
	System.out.println(name.indexOf('h'));
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	System.out.println(name.concat(" is my name"));
	String l_name="Vignesh";
	System.out.println(name.concat(" ").concat(l_name));
	System.out.println(name.contains("yaa"));
	System.out.println(name.contains("yAa"));
	String new_name=" Dee pika ";
	System.out.println(new_name.trim());
}
}
