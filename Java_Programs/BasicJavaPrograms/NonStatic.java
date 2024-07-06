package Package1;

public class NonStatic
//How to call a non static method inside a main method
{
	void add()
	{
		int a=200;
		int b=100;
		System.out.println(a+b);
	}
	void sub()
	{
		int a=200;
		int b=100;
		System.out.println(a-b);
	}
	void mul()
	{
		int a=200;
		int b=100;
		System.out.println(a*b);
	}
	void div()
	{
		int a=200;
		int b=100;
		System.out.println(a/b);
	}
	void mod()
	{
		int a=200;
		int b=100;
		System.out.println(a%b);
	}
		public static void main(String[] args) 
	{
  NonStatic a1 = new NonStatic();
	a1.add();
	a1.sub();
	a1.mul();
	a1.div();
	a1.mod();

	}

}
