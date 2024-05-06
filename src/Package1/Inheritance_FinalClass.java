package Package1;
class Test
{
	static void add()
	{
		System.out.println("addition");
	}
}

class Inheritance_FinalClass extends Test
{
	public static void main(String[] args)
	{
		System.out.println("subtraction");
		add();
	}

}
