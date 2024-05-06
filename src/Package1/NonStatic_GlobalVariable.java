package Package1;

public class NonStatic_GlobalVariable 
{
String name="Sita";  //non static global variable
int age=19;      //non static global variable
double weight=58.75;  //non static global variable
void add(String name,int age,double weight)    //non static method with local variable
{
	System.out.println("My details are "+name+age+weight);
}

	public static void main(String[] args)
	{
		NonStatic_GlobalVariable g1=new NonStatic_GlobalVariable();
		System.out.println(g1.name);  //calls non static global variable
		System.out.println(g1.age);   //calls non static global variable
		g1.add("ram",65,56.50);    //calls non static method with local variable

	}

}
