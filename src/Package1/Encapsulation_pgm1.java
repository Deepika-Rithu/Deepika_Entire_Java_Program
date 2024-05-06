package Package1;
class Amazon_Application
{
	private String un="contact@grotechminds.com";
	
	public String getUn()
	{
		return un;
	}
	
	public void setUn(String un) //use the value as a parameter to set the new value
	{
		this.un=un;
	}
}
public class Encapsulation_pgm1
{
	public static void main(String[] args)
	{
		Amazon_Application a1=new Amazon_Application();
		a1.setUn("deepik27@gmail.com");
		System.out.println(a1.getUn());
	}
}
