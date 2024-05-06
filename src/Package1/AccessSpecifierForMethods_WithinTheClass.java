package Package1;

public class AccessSpecifierForMethods_WithinTheClass 
{
	public void add()
	{
		System.out.println("1");
	}
	private void sub()
	{
		System.out.println("2");
	}
	protected void mul()
	{
		System.out.println("3");
	}
	void div()
	{
		System.out.println("4");
	}

	public static void main(String[] args)
	{
		AccessSpecifierForMethods_WithinTheClass  a=new AccessSpecifierForMethods_WithinTheClass();
		a.add();
		a.sub();
		a.mul();
		a.div();
	}

}
