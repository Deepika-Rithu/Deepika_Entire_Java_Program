package Package1;
class Parent_Cl
{
	void login()                   //same method name and argument but different implementation
	{
		System.out.println("Login with mobile number");
	}
}

class Method_Overriding_Super_Keyword extends Parent_Cl
{
	void login()             
	{
		super.login();      //calls the parent class method
		System.out.println("Login with email id");    
		super.login();   
	}
	public static void main(String[] args)
	{
		Method_Overriding_Super_Keyword m1=new Method_Overriding_Super_Keyword();
		m1.login();
	}

}
