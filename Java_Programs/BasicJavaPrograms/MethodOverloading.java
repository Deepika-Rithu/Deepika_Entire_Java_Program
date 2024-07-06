package Package1;


public class MethodOverloading
//To demonstrate method overloading
{
	void add()
	{
	int a=100;
		System.out.println(a+6);
	}
    void add(int a)
    {
    	System.out.println(a+6);
    }
   static void add(double a)
   {
	   System.out.println(a+6);
   }
   void add(int a, int b, int c, int d)
   {
	   a=100;
	   System.out.println(a+b+c+d);

   }

	public static void main(String[] args) 
	{
     add(0.09);           //calls static method
     MethodOverloading m1=new MethodOverloading();
     m1.add();            //calls non static method with no argument
     m1.add(6789);         //calls non static method with single int datatype argument
     m1.add(10, 20, 30, 40);   //calls non static method with 4 int datatype argument
     
	}

}
