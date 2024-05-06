package Package1;

public class Static_GlobalVariable 
{
	static int age=43;
	static String name;
	static void add()
	{
		System.out.println(age);
	}

	public static void main(String[] args) 
	{
	age=100;
	System.out.println(age);
	name="Deepika";
	name="Rithu";
	System.out.println(name);

	}

}
