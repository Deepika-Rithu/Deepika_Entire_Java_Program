package Package1;
interface Interface2         //Interface2 with 2 abstract methods
{
	void login();
	void logout();
}
interface Interface1 extends Interface2        //Interface1 with 2 abstract methods
{
	void search();
	void payment();
}
public class InterfacePgm2 implements Interface1         //Concrete Class
{
	void order_page()
	{
		System.out.println("order");
	}
	static void address_page()
	{
		System.out.println("address");
	}

	public static void main(String[] args) 
	{
		InterfacePgm2 I2=new InterfacePgm2();
		address_page();
		I2.order_page();
		I2.login();
		I2.logout();
		I2.search();
		I2.payment();
	}
	@Override
	public void login() 
	{
		System.out.println("login");
		
	}
	@Override
	public void logout() 
	{
		System.out.println("logout");
		
	}
	@Override
	public void search()
	{
		System.out.println("search");
		
	}
	@Override
	public void payment() 
	{
		System.out.println("payment");
	}

}
