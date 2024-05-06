package Package1;
public class CalculationsUsingLocalVariable
{
			static void add()
		{
			int a=10;  //Local Variable
			int b=20;  //Local Variable
			System.out.println("Addition of two numbers is "+(a+b));
		}
		void sub(int a,int b)  //Local Variable
		{
			System.out.println("Subtraction of two numbers is "+(a-b));
		}
		static void mul()
		{
			int a=30;  //Local Variable
			int b=40;  //Local Variable
			System.out.println("Multiplication of two numbers is "+(a*b));
		}
		void div(int a,int b)  //Local Variable
		{
			System.out.println("Division of two numbers is "+(a/b));
		}
		static void mod()
		{
			int a=30;  //Local Variable
			int b=20;  //Local Variable
			System.out.println("Modulus of two numbers is "+(a%b));
		}
		public static void main(String[] args)
		{
			add();
			CalculationsUsingLocalVariable m1=new CalculationsUsingLocalVariable();
			m1.sub(40,50);
			mul();
			m1.div(60,30);
			mod();
		}
	}
