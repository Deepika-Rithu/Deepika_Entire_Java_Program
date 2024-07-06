package Package1;
class StudentClass
{
	StudentClass(int a)
	{
		System.out.println("Student Constructor");
	}
}
public class Class1InvokingClass2Constructor
{
	Class1InvokingClass2Constructor()
	{
		System.out.println("Invoking Constructor");
	}
	public static void main(String[] args) 
	{
	new Class1InvokingClass2Constructor();
	new StudentClass(40);

	}

}
