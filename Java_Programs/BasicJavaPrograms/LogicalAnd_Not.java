package Package1;

public class LogicalAnd_Not
{

	public static void main(String[] args) 
	{
		int a=20;
		int b=30;
		if(!(a==b&&b!=a))     //!(F && T) is !F which is T. so it will be printed
				{
			System.out.println("And with Not Operator");
				}


	}

}
