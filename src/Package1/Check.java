package Package1;
import java.util.Scanner;
public class Check
//Arithmetic Operation using scanner class
{
	void add(int num1,int num2)
	{
		int sum=num1+num2;
		System.out.println("The sum of two numbers is "+sum);
	}
	void sub(int num1,int num2)
	{
		int difference=num1-num2;
		System.out.println("The difference of two numbers is "+difference);
	}
	void mul(int num1,int num2)
	{
		int product=num1*num2;
		System.out.println("The product of two numbers is "+product);	
	}
	void div(int num1,int num2)
	{
		int quotient=num1/num2;
		System.out.println("The quotient of two numbers is "+quotient);
	}
	void mod(int num1,int num2)
	{
		int remainder=num1%num2;
		System.out.println("The remainder of two numbers is "+remainder);
	}
	public static void main(String[] args)
	{
	Scanner s1=new Scanner(System.in);
	Check c1=new Check();
	System.out.println("Enter first number");
	int num1=s1.nextInt();
	System.out.println("Enter second number");
	int num2=s1.nextInt();	
	c1.add(num1,num2);
	c1.sub(num1,num2);
	c1.mul(num1,num2);
	c1.div(num1,num2);
	c1.mod(num1,num2);
	s1.close();
	}

}
