package Package1;

public class MathClassProgram 
{
	public static void main(String[] args)
	{
		System.out.println(Math.PI);
		double pi=Math.PI;
		System.out.println(pi);
		System.out.println(Math.addExact(25, 45));
		System.out.println(Math.addExact(453463436,456463464));
		System.out.println(Math.subtractExact(100,300));
		System.out.println(Math.multiplyExact(30,500));
		System.out.println(Math.sqrt(100));
		System.out.println(Math.max(4545, 3425));
		System.out.println(Math.min(7364, 6735));
		System.out.println(Math.random());
		for(int i=0;i<100;i++)
		{
			System.out.println(Math.random());
		}

	}

}
