package Package1;

public class ThisCallingStatement_Pgm1 
{
	ThisCallingStatement_Pgm1()
	{
		this(50);
		System.out.println("zero");
	}
	ThisCallingStatement_Pgm1(int a)
	{
		this(20,50.45,"Deepi");
		System.out.println("one");
	}
	ThisCallingStatement_Pgm1(int a,double b)
	{
		System.out.println("two");
	}
	ThisCallingStatement_Pgm1(int a,double b,String c)
	{
		this(27,44.88);
		System.out.println("three");
	}
		public static void main(String[] args) 
	{
		
			new ThisCallingStatement_Pgm1();
	}

}
