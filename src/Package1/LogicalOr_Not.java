package Package1;

public class LogicalOr_Not 
{

	public static void main(String[] args) 
	{
	int a=20;
	int b=30;
	if(!(a==b||b!=a))     //!(F || T) is !T which is F. so else block will be printed
			{
		System.out.println("Or with Not Operator");
			}
	else
	{
		System.out.println("Bye");
	}
	}

}
