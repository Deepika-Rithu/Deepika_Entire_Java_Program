package Package1;

public class FinalVariable_AreaAndCircumferenceOfCircle
//To find area and circumference of circle using final variable
{
	final static double pi=3.14;
	static int r=10;

	public static void main(String[] args)
	{
	double area= pi*r*r;
	double circumference= 2*pi*r;
	System.out.println("The area of the circle is "+area);
	System.out.println("The circumference of the circle is "+circumference);

	}

}
