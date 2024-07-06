package Package1;
class Parent_Class1
{
	Parent_Class1(int a,int b)                  //Parameterized Constructor
	{
		System.out.println("Grand Parent");
	}
}
class Child_Class1 extends Parent_Class1
{
	Child_Class1()                   //Non Parameterized Constructor
	{
		super(100,200);                      //parameterized super calling statement
		System.out.println("Parent");
	}
}
public class SuperCallingStatement_Pgm1 extends Child_Class1
{
	SuperCallingStatement_Pgm1()               //Constructor
	{
		super();                          //Non parameterized super calling statement
		System.out.println("Child");
	}

	public static void main(String[] args) 
	{
		new SuperCallingStatement_Pgm1();

	}

}
