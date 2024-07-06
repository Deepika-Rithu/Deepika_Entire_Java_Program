package Package1;

public class ThisCallingStatement_Pgm2 
{
	ThisCallingStatement_Pgm2()
	{
		System.out.println("School");
	}
	ThisCallingStatement_Pgm2(int a)
	{
		this("deepika");
		System.out.println("College");
	}
	ThisCallingStatement_Pgm2(String a)
	{
		this();
		System.out.println("Work");
	}

	public static void main(String[] args) 
	{
		System.out.println("Marriage");
		new ThisCallingStatement_Pgm2(5);

	}

}
