package Package1;

public class ConstructorOverloading
//To demonstrate constructor overloading
{
ConstructorOverloading()
{
	System.out.println("Constructor 1");
}
ConstructorOverloading(int a)
{
	System.out.println("Constructor 2");
}
ConstructorOverloading(float b)
{
	System.out.println("Constructor 3");
}
ConstructorOverloading(char c)
{
	System.out.println("Constructor 4");
}
ConstructorOverloading(String d)
{
	System.out.println("Constructor 5");
}
ConstructorOverloading(boolean e)
{
	System.out.println("Constructor 6");
}
ConstructorOverloading(int a,float b,char c, String d, boolean e, long f, double g)
{
	System.out.println("Constructor 7");
}
	public static void main(String[] args)
	{
		new ConstructorOverloading();
		new ConstructorOverloading(89);
		new ConstructorOverloading(374.884f);
		new ConstructorOverloading('x');
		new ConstructorOverloading("good");
		new ConstructorOverloading(true);
		new ConstructorOverloading(45,5468.90f,'d',"bad",false,789363,76376724.7676574);
		}

}
