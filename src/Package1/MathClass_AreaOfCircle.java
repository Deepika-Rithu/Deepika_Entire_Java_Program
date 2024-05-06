package Package1;
public class MathClass_AreaOfCircle
{
public static void main(String[] args)
	{
	double pi=Math.PI;
	for(int i=1;i<=10;i++)
		{
		double radius=Math.random();
		double area=pi*radius*radius;
		System.out.println("Radius of circle "+i+" is "+radius);
		System.out.println("Area of circle "+i+" is "+area);
		}
	}
}
