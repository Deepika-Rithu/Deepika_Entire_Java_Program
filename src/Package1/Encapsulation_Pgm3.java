package Package1;
class Password_Pgm
{
	private int age=34;
	private String un="abc@gmail.com";
	private String pwd="password123";
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getUn()
	{
		return un;
	}
	public void setUn(String un)
	{
		this.un=un;
	}
	public String getPwd()
	{
		return pwd;
	}
	public void setPwd(String pwd)
	{
		this.pwd=pwd;
	}
}
public class Encapsulation_Pgm3
{
	public static void main(String[] args) 
	{
		Password_Pgm p1=new Password_Pgm();
		p1.setAge(13);
		p1.setUn("deepik27@gmail.com");
		p1.setPwd("NewPassword123");
		System.out.println(p1.getAge());
		System.out.println(p1.getUn());
		System.out.println(p1.getPwd());
	}

}
