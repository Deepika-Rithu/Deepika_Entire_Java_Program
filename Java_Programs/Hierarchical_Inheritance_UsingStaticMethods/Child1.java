package Hierarchical_Inheritance_UsingStaticMethods;

public class Child1 extends Parent
{
	static void add()
	{
		System.out.println("Addition");
	}
	public static void main(String[] args) 
	{
		add();
		mul();
	}

}
