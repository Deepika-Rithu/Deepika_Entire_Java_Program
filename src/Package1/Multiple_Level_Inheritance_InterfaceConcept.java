package Package1;
interface YouTube
{
	void play();
	void search();
}
interface Gmail
{
	void compose();
	void send();
}

public class Multiple_Level_Inheritance_InterfaceConcept implements YouTube,Gmail
{

	public static void main(String[] args)
	{
		Multiple_Level_Inheritance_InterfaceConcept M1=new Multiple_Level_Inheritance_InterfaceConcept();
		M1.compose();
		M1.send();
		M1.play();
		M1.search();
	}

	@Override
	public void compose() 
	{
		System.out.println("Compose");
	}

	@Override
	public void send()
	{
		System.out.println("Send");
	}

	@Override
	public void play() 
	{
		System.out.println("Play");
	}
	@Override
	public void search() 
	{
		System.out.println("Search");
	}
}
