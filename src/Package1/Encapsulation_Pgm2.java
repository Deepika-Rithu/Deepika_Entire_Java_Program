package Package1;
class Age_Program
{
	private int age=45;
	public int getAge() 
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
}

public class Encapsulation_Pgm2 
{
	public static void main(String[] args)
	{
		Age_Program a1=new Age_Program();
		a1.setAge(64);
		System.out.println(a1.getAge());
	}
}
