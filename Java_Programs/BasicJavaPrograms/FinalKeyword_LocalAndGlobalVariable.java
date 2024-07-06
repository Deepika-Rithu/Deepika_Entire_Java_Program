package Package1;
public class FinalKeyword_LocalAndGlobalVariable
{
	final int a=20;    //Global variable with final keyword
	final int b=50;
	void add()
	{
		final int a=10;      //Local variable with final keyword 
		final int b=90;
		System.out.println(a+b);
	}
	void sub()
	{
		System.out.println(a-b);
	}

	public static void main(String[] args)
	{
		FinalKeyword_LocalAndGlobalVariable f1=new FinalKeyword_LocalAndGlobalVariable();
		f1.add();
		f1.sub();
	}
}
