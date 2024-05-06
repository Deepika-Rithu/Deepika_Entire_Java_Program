package Package1;
class Register                         //Concrete Class
{
	static void Uname()               //Concrete Method
	{
		System.out.println("Username");
	}
	static void Pwd()                      //Concrete Method
	{
		System.out.println("Password");
	}
	
}
abstract class Signin extends Register           //Abstract Class
{
	abstract void signout();                     //Abstract Method
	abstract void logout();                      //Abstract Method
	void close()                                 //Concrete Method
	{
		System.out.println("Close");
	}
	void exit()                                     //Concrete Method
	{
		System.out.println("Exit");
	}
}

public class AbstractMethod_Login extends Signin            //Concrete Class
{
	static void userid()                         //Concrete Method
	{
		System.out.println("Userid");
	}
	static void passkey()                       //Concrete Method
	{
		System.out.println("Passkey");
	}

	public static void main(String[] args) 
	{
		AbstractMethod_Login a1=new AbstractMethod_Login();
		Uname();
		Pwd();
		a1.signout();
		a1.logout();
		a1.close();
		a1.exit();
		userid();
		passkey();
	}
	@Override
	void signout() 
	{
		System.out.println("Signout");
	}
	@Override
	void logout()
	{
		System.out.println("Logout");
	}

}
