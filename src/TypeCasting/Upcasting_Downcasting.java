package TypeCasting;
class ParentClass
{
	void add()
	{
		System.out.println("Addition");
	}
	}

public class Upcasting_Downcasting extends ParentClass
{
	void sub()
	{
		System.out.println("Subtraction");
	}
	public static void main(String[] args)
	{
	ParentClass p1=new Upcasting_Downcasting();   //Upcasting
	Upcasting_Downcasting u1=(Upcasting_Downcasting) p1;       //Downcasting
	p1.add();
	u1.sub();
	}
}
