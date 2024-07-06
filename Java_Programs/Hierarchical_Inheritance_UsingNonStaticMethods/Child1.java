package Hierarchical_Inheritance_UsingNonStaticMethods;

public class Child1 extends Parent
{
	void add()
	{
		System.out.println("Addition");
	}
	public static void main(String[] args) 
	{
		Child1 c1=new Child1();
		c1.add();
		c1.mul();
	}

}
