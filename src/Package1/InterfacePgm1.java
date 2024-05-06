package Package1;
interface keyboard
{
	void login();
	void logout();
}

public class InterfacePgm1 implements keyboard
{

	public static void main(String[] args)
	{
		InterfacePgm1 I1=new InterfacePgm1();
		I1.login();
		I1.logout();
	}

	@Override
	public void login() 
	{
		System.out.println("Login");
		
	}

	@Override
	public void logout()
	{
		System.out.println("Logout");
		
	}

}
