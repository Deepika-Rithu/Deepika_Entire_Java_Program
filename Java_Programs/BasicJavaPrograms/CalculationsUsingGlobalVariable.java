package Package1;

public class CalculationsUsingGlobalVariable 
//Program to do add,sub,mul,mod using global variable
{
	int a=500;
	int b=200;
	void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void sub()
	{
		int difference=a-b;
		System.out.println(difference);
	}
	void mul()
	{
		int product=a*b;
		System.out.println(product);
	}
	void div()
	{
		int quotient=a/b;
		System.out.println(quotient);
	}
	void mod()
	{
		int remainder=a%b;
		System.out.println(remainder);
	}
	public static void main(String[] args) 
	{
		CalculationsUsingGlobalVariable m1=new CalculationsUsingGlobalVariable();
		m1.add();
		m1.sub();
		m1.mul();
		m1.div();
		m1.mod();
} 
}
