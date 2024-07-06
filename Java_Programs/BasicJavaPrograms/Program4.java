package Package1;

public class Program4 
//To add, sub, div, mul and find modulus by calling static method inside main method
{
static void add()
{
	int a=100;
	int b=200;
	int add=a+b;
	System.out.println("The sum is "+add);
}
static void sub()
{
	int a=100;
	int b=200;
	int sub=a-b;
	System.out.println("The diff is "+sub);
}
static void mul()
{
	int a=100;
	int b=200;
	int mul=a*b;
	System.out.println("The product is "+mul);
}
static void div()
{
	int a=100;
	int b=200;
	int div=a/b;
	System.out.println("The quotient is "+div);
}
static void mod()
{
	int a=100;
	int b=200;
	int mod=a%b;
	System.out.println("The remainder is "+mod);
}
	public static void main(String[] args) 
	{
	add();
	sub();
	mul();
	div();
	mod();

	}

}
