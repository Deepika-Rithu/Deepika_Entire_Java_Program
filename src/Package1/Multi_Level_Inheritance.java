package Package1;
class Grand_Parent1      //supermost class
{
	static void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Addition of two numbers is "+sum);
	}
}
class Parent1 extends Grand_Parent1   //super class inheriting supermost class
{
	void sub()
	{
		int a=10;
		int b=20;
		int diff=a-b;
		System.out.println("Difference of two numbers is "+diff);
	}
}

public class Multi_Level_Inheritance extends Parent1     //sub class inheriting super class
{
	void mul()
	{
		int a=10;
		int b=20;
		int prod=a*b;
		System.out.println("Product of two numbers is "+prod);
	}

	public static void main(String[] args)
	{
		Multi_Level_Inheritance a1=new Multi_Level_Inheritance();
		add();
		a1.sub();
		a1.mul();
		
	}

}
