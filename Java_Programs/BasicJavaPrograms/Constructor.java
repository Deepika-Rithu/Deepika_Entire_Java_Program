package Package1;

public class Constructor 
//To create methods Static, Non Static and Constructor in a single program and call them in main method
{
	Constructor()     //Constructor method 1
	{
		System.out.println("Constructor");
	}
	void add()     //Non Static method 2
	{
		System.out.println("Non Static");
	}
	static void sub()   //Static method 3
	{
		System.out.println("Static");
	}

	public static void main(String[] args) //Main method 4
	{
     Constructor a1 = new Constructor(); //object created. Constructor automatically invoked
     new Constructor();                  //object created. Constructor automatically invoked
     a1.add();                           //Non static method invoked
     sub();                              //Static method invoked
     
	}

}
