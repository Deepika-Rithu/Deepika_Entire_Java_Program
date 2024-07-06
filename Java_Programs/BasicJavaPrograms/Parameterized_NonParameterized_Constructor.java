package Package1;

public class Parameterized_NonParameterized_Constructor 
//To create parameterized and non parameterized constructor and how to call them in main method
{
	Parameterized_NonParameterized_Constructor()
	{
		System.out.println("Non Parameterized");
	}
	Parameterized_NonParameterized_Constructor(int a)
	{
		System.out.println("Parameterized");
	}

	public static void main(String[] args) 
	{
		new Parameterized_NonParameterized_Constructor();
		new Parameterized_NonParameterized_Constructor(27);

	}

}
