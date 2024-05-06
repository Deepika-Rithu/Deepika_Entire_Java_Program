package Package1;

public class GlobalVariable_DefaultValue_UpdatedValue 
{
	static int a;      //Global variable declaration
	public static void main(String[] args) 
	{
		System.out.println("Default value of a is "+a);  //printing default value
		a=200;                                           //updating the value
		System.out.println("Updated value of a is "+a);

	}

}
