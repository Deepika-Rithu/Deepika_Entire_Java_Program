package Package1;

public class ThisKeyword
{
int age;
String name;
double salary;
void student_details(int age,String name,double salary)
{
	System.out.println("Name is "+name+" Age is "+age+" Salary is "+salary);
	this.age=age;
	this.name=name;
	this.salary=salary;
}
	public static void main(String[] args) 
	{
		ThisKeyword m1=new ThisKeyword();
		m1.student_details(34,"Deepika",84000.75);
		System.out.println(m1.age);
		System.out.println(m1.name);
		System.out.println(m1.salary);

	}

}
