package Package1;
class Parent_Class
{
	void add()
	{
		System.out.println("Addition");
	}
	void sub()
	{
		System.out.println("Subtraction");
	}
}
public class Single_Level_Inheritance_NonStaticMethods extends Parent_Class
{
	void mul()
	{
		System.out.println("Multiplication");
	}
	public static void main(String[] args) 
	{
		Single_Level_Inheritance_NonStaticMethods s1=new Single_Level_Inheritance_NonStaticMethods();
		s1.add();
		s1.sub();
		s1.mul();

	}

}
