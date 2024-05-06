package Package1;
class Parnt
{
	void mul()
	{
		System.out.println("Multiplication");
	}
}
class Hierarchical_Level_Inheritance_Child2 extends Parnt
{
		void add()
		{
			System.out.println("Addition");
		}
}

public	class Hierarchical_Level_Inheritance_Child1 extends Parnt
	{
		void sub()
		{
			System.out.println("Subtraction");
		}  

	public static void main(String[] args) 
	{
		Hierarchical_Level_Inheritance_Child1 a1=new Hierarchical_Level_Inheritance_Child1();
		Hierarchical_Level_Inheritance_Child2 a2=new Hierarchical_Level_Inheritance_Child2();
		a2.add();
		a1.sub();
		a1.mul();
		a2.mul();
	}

}

