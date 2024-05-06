package Package1;

public class LocalVariable 
{
	static void add()
	{
		int a=10;  //Local Variable
		int b=20;  //Local Variable
		System.out.println(a+b);
	}
	void add(int a,int b)  //Local Variable
	{
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		int a=100;  //Local Variable
		a=10;
		System.out.println(a);
		add();
		LocalVariable m1=new LocalVariable();
		m1.add(40,50);

	}

}
