package Package1;

class RunTimePoymorphism
{
	void login()                  
	{
		System.out.println("Login with mobile number");
	}
}

public class Polymorphism extends RunTimePoymorphism
{
	void login()             
	{
		System.out.println("Login with email id");     
	}
	public static void main(String[] args)
	{
		RunTimePoymorphism m1=new RunTimePoymorphism();
		m1.login();

	}
}