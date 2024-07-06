package Package1;
class College
{
	College(String college_name)
	{
		System.out.println("College");
	}
}
class School extends College
{
	School(int a,String b,double c)
	{
		super("ABC College");
		System.out.println("School");
	}
}

public class SuperCallingStatement_Pgm2 
{

	public static void main(String[] args)
	{
		School S1=new School(10,"Deepika",73467.734678);

	}

}
