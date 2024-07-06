package Hierarchical_Inheritance_UsingNonStaticMethods;

public class Child2 extends Parent
{
	void sub()
	{
		System.out.println("Subtraction");
	}

public static void main(String[] args) 
{
	Child2 c2=new Child2();
	c2.sub();
	c2.mul();
}

}
