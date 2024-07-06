package Package1;

public class SIB_IIB_MM_Costructor 
//To check order of execution when SIB,IIB,MM and Constructor are in same program
{

	public static void main(String[] args)
	{
	System.out.println("Main Method");
	SIB_IIB_MM_Costructor S1=new SIB_IIB_MM_Costructor();
	new SIB_IIB_MM_Costructor();
	}
	SIB_IIB_MM_Costructor()
	{
		System.out.println("Constructor");
	}
	static
	{
		System.out.println("SIB 1");
	}
	static
	{
		System.out.println("SIB 2");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}

}
