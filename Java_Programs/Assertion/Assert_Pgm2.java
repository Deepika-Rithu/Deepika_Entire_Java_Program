package Assertion;
public class Assert_Pgm2 
{
	static void add(int a,int b)
	{
		assert a==100;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
	add(200,300);
	}
}
