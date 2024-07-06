package Package1;

public class IIB
{
static
	{
	System.out.println("SIB 1");
	}
	{
	System.out.println("IIB 1");
	}
static
	{
	System.out.println("SIB 2");
	}
	{
	System.out.println("IIB 2");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		IIB a1=new IIB();
		IIB a2=new IIB();
	}

}
