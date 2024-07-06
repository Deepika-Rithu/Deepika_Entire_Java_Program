package Package1;
//single level inheritance while using static methods
class Parent
{
	static void add()
	{
		System.out.println("Addition");
	}
}

public class Single_Level_Inheritance_StaticMethods extends Parent
{
	static void sub()
	{
		System.out.println("subtraction");
	}

	public static void main(String[] args)
	{
		add();
		sub();
	}

}
