package Package1;
abstract class Amazon_Auth
{
	abstract void un();
	abstract void un_mob();
	void login_button()
	{
		System.out.println("logic");
	}
}
abstract class Amazon_Login extends Amazon_Auth
{
	abstract void un_as_email();
	abstract void un_as_mobile();
	void registration_button()
	{
		System.out.println("logic 1");
	}
	
}

public class Abstract_Method extends Amazon_Login
{
	static void loginwith_mob()
	{
		System.out.println("logic 2");
	}
	static void loginwith_email()
	{
		System.out.println("logic 3");
	}

	public static void main(String[] args)
	{
		Abstract_Method c1= new Abstract_Method();
		c1.un_mob();
		c1.un();
		c1.un_as_email();
		c1.un_as_mobile();
		c1.registration_button();
		c1.login_button();
		loginwith_email();
		loginwith_mob();
	}
	@Override
	void un_as_email() 
		{
			System.out.println("email");
		}
	@Override
	void un_as_mobile() 
		{
			System.out.println("mobile");
		}
	@Override
	void un() 
	{
		System.out.println("un");
	}
	@Override
	void un_mob()
	{
		System.out.println("mob");
	}
}
