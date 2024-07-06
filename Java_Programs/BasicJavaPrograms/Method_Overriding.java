package Package1;
class ParentClass
{
	void login()                   //same method name and argument but different implementation
	{
		System.out.println("Login with mobile number");
	}
}

public class Method_Overriding extends ParentClass
{
	void login()             
	{
		System.out.println("Login with email id");     
	}
	public static void main(String[] args)
	{
		Method_Overriding m1=new Method_Overriding();
		m1.login();

	}

}
